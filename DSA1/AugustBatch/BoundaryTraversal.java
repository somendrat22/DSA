import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        boundaryTraversal(m, n, matrix);
        sc.close();
    }

    public static void boundaryTraversal(int m, int n, int[][] matrix) {
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
			totalCount = 2*matrix.length + 2*matrix[0].length - 4;
		}
		
		int count = 0;
		// Top Boundary 
		// We are going to fix our row to minRow and we have to travel over the minRow from left to Right. 
		// minCol to maxCol;

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
		
	}
    
}
