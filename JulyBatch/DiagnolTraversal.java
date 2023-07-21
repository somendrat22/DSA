
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
        for(int dig = mat[0].length - 1; dig >= 0; dig--){
			int i = 0;
			int j = dig;
			while(j < mat[0].length){
				System.out.print(mat[i][j] + " ");
				i++;
				j++;
			}
		}


		return new ArrayList<>();
        
    }
}
