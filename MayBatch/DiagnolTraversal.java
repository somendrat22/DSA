import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        sc.close();
        ArrayList<Integer> res = diagonalTraversal(mat, n);
        for (Integer x : res)
            System.out.print(x + " ");
    }

    public static ArrayList<Integer> diagonalTraversal(int[][] mat, int n) {
		ArrayList<Integer> ans = new ArrayList<>();
        for(int dig = mat[0].length - 1; dig >= 0; dig--){
			int j = dig;
			int i = 0;
			while(j < mat[0].length){
				ans.add(mat[i][j]);
				i++;
				j++;
			}
		}


		for(int dig = 1; dig < mat.length; dig++){
			int i = dig;
			int j = 0;
			while(i < mat.length){
				ans.add(mat[i][j]);
				i++;
				j++;
			}
		}

		return ans;
        
    }
}
