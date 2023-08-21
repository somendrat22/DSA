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

    public static void spirallyTraverse(int [][] matrix) {
       // your code here

		int minRow = 0;
		int minCol = 0;
		int maxRow = matrix.length - 1;
		int maxCol = matrix[0].length - 1;
		int totalCount  = 0;
		if(minRow == maxRow){
			totalCount  = matrix[0].length;
		}else if(minCol == maxCol){
			totalCount = matrix.length;
		}else{
			totalCount = matrix.length*matrix[0].length;
		}
		
		int count = 0;


	  while(count < totalCount){
		for(int col  = minCol; col <= maxCol && count < totalCount; col++){
			System.out.print(matrix[minRow][col] + " ");
			count++;
		}

		minRow++;

		// Right Boundary : 
		// I have to fix my col to maxCol and as i need to move from top to bottom 
		// I have to travel over minRow to maxRow

		for(int row = minRow; row <= maxRow && count < totalCount; row++){
			System.out.print(matrix[row][maxCol] + " ");
			count++;
		}

		maxCol--;

		// Bottom Boundary 
		// We have to fix our row to maximumRow and we will vary our col from maxCol to minCol

		for(int col = maxCol; col >= minCol && count < totalCount; col--){
			System.out.print(matrix[maxRow][col] + " ");
			count++;
		}

		maxRow--;

		// leftBoundary 
		// We will fix our col to the minCol and we will vary our row from maxRow to minRow

		for(int row = maxRow; row >= minRow  && count < totalCount; row--){
			System.out.print(matrix[row][minCol] + " ");
			count++;
		}
		minCol++;
	  }
		  
		
     
    }
}
