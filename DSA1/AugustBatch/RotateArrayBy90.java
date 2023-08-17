import java.io.*;
import java.util.*;

class Solution {

	 public int[][] matrixTranspose(int[][] mat) {
       int [][] transposed = new int[n][n];

	   for(int row = 0; row < mat.length; row++){
		   for(int col  = 0; col < mat[0].length; col++){
			  transposed[col][row] =  mat[row][col];
		   }
	   }

		return transposed; // 5k
	}
    public void rotateBy90(int [][]mat) {
        // Your code here

		// Transpose the array
		mat = matrixTranspose(mat);

		// Do row by row reversal 
		for(int row  = 0; row < mat.length; row++){
			int [] rowArr = mat[row];
			int i  = 0;
			int j = rowArr.length -1;

			while(i < j){
				int temp = rowArr[i];
				rowArr[i] = rowArr[j];
				rowArr[j] = temp;
				i++;
				j--;
			}
			
		}


		for(int i  = 0; i < mat.length; i++){
			for(int j = 0; j < mat[0].length; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [][]mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        Obj.rotateBy90(mat);
        System.out.println('\n');
    }
}
