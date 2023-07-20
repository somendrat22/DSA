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
		if(matrix[0].length == 1){
			for(int row  = 0;  row < matrix.length; row++){
				System.out.print(matrix[row][0] + " ");
			}
			return;
		}

		if(matrix.length == 1){
			for(int col  = 0; col < matrix[0].length; col++){
				System.out.print(matrix[0][col] + " ");
			}
			return;
		}
		// TopRow 
		for(int col = minCol; col <= maxCol; col++){
			System.out.print(matrix[minRow][col] + " ");
		}
		// RightCol 
		minRow++;
		for(int row = minRow; row <= maxRow; row++){
			System.out.print(matrix[row][maxCol] + " ");
		}
		// Bottom Boundary
		maxCol--;
		for(int col  = maxCol; col >= minCol; col--){
			System.out.print(matrix[maxRow][col] + " ");
		}
		// leftBoundary
		maxRow--;
		for(int row = maxRow; row >= minRow; row--){
			System.out.print(matrix[row][minCol] + " ");
		}
    }
    
}
