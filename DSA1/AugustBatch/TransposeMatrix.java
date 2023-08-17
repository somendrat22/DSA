import java.util.*;
import java.io.*;

class Solution {
    public int[][] matrixTranspose(int[][] mat, int n) {
       int [][] transposed = new int[n][n];

	   for(int row = 0; row < mat.length; row++){
		   for(int col  = 0; col < mat[0].length; col++){
			  transposed[col][row] =  mat[row][col];
		   }
	   }

		return transposed;
	}}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        int[][] ans = Obj.matrixTranspose(matrix, n);
        for(int i=0; i<n; i++)
        {   for(int j=0; j<n; j++)
                  {
                       System.out.print(ans[i][j] + " ");
                  } System.out.println("");
        }
        sc.close();
    }
}
