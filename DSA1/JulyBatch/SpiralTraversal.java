import java.io.*;
import java.util.*;

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

        spirallyTraverse(mat);     
        System.out.println('\n');
    }

    public static void spirallyTraverse(int [][]matrix) {
		int minRow = 0;
		int minCol = 0;
		int maxRow = matrix.length - 1;
		int maxCol = matrix[0].length - 1;
		int totalElements = matrix.length*matrix[0].length;
		int count = 0;
		while(count < totalElements){
			// TopRow 
			for(int col = minCol; col <= maxCol && count < totalElements; col++){
				System.out.print(matrix[minRow][col] + " ");
				count++;
			}
			// RightCol 
			minRow++;
			for(int row = minRow; row <= maxRow && count < totalElements; row++){
				System.out.print(matrix[row][maxCol] + " ");
				count++;
			}
			// Bottom Boundary
			maxCol--;
			for(int col  = maxCol; col >= minCol && count < totalElements; col--){
				System.out.print(matrix[maxRow][col] + " ");
				count++;
			}
			// leftBoundary
			maxRow--;
			for(int row = maxRow; row >= minRow && count < totalElements; row--){
				System.out.print(matrix[row][minCol] + " ");
				count++;
			}
			minCol++;
		}
         
     
    }
}
