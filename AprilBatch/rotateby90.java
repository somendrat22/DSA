import java.io.*;
import java.util.*;

class Solution {
	public void print(int [][] mat){
		for(int i = 0; i<mat.length; i++){
			for(int j = 0; j<mat[i].length; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void matrixTranspose(int[][] mat) {
       for(int dig = 0; dig < mat[0].length; dig++){
		   int i = 0;
		   int j = dig;
		   while(j < mat[0].length){
			   int temp = mat[i][j];
			   mat[i][j] = mat[j][i];
			   mat[j][i] = temp;
			   i++;
			   j++;
		   }
	   }
		
		
		
}
    public void rotateBy90(int [][]mat) {
        // Your code her
		matrixTranspose(mat);

		for(int row = 0; row<mat.length; row++){
			int st = 0;
			int en = mat[0].length - 1;
			while(st < en){
				int temp = mat[row][st];
				mat[row][st] = mat[row][en];
				mat[row][en] = temp;
				st++;
				en--;
			}
		}

		print(mat);
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