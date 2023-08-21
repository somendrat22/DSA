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

		// Upper Dig
		
		for(int dig = 0; dig < mat[0].length; dig++){
			int i = 0;
			int j = dig;
		    while(j < mat[0].length){
				System.out.print(mat[i][j] + " ");
				i++;
				j++;
			}
			System.out.println();
		}


		// Lower Dig 

		for(int dig = 0; dig < mat.length; dig++){
			int i = dig;
			int j = 0;
		    while(i < mat.length){
				System.out.print(mat[i][j] + " ");
				i++;
				j++;
			}
			System.out.println();
		}

		return new ArrayList<>();
        
    }
}
