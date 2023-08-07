import java.io.*;
import java.util.*;

class Solution {
	public int[][] matrixTranspose(int[][] mat) {
	  int [][] transpose = new int[mat.length][mat[0].length];
      for(int i = 0; i < mat.length; i++){
		  for(int j  = 0; j < mat[0].length; j++){
			 transpose[j][i] = mat[i][j];
		  }
	  }
		return transpose;
	}
	public void reverseArray(int [] arr){
		int i = 0;
		int j = arr.length - 1;
		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
    public void rotateBy90(int [][]mat) {
        // Transposed Matrix
		mat = matrixTranspose(mat);
		for(int row = 0; row < mat.length; row++){
			int [] arr = mat[row];
			reverseArray(arr);
		}

		for(int i = 0; i < mat.length; i++){
			for(int j  = 0; j < mat[0].length; j++){
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
