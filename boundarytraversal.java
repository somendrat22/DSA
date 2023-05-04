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
        int minrow = 0;
	    int mincol = 0;
	    int maxrow = matrix.length - 1;
		int maxcol = matrix[0].length - 1;
		int totalCount; 
		if(n == 1){
			totalCount = m;
		}else if(m == 1){
			totalCount = n;
		}else{
			totalCount = 2*m + 2*n - 4
		}
		int count = 0;
		// Top Boundary
		for(int row = minrow, col = mincol; col <= maxcol && count < totalCount; col++){
			System.out.print(matrix[row][col] + " ");
			count++;
		}
		minrow++;
		// Rightmost boundary
		for(int row = minrow, col = maxcol; row <= maxrow  && count < totalCount;  row++){
			System.out.print(matrix[row][col] + " ");
			count++;
		}
		// bottom boundary
		maxcol--;
		for(int row = maxrow, col = maxcol; col >= mincol  && count < totalCount; col--){
			System.out.print(matrix[row][col] + " ");
			count++;
		}
		// leftmost boundary 
		maxrow--;
		for(int row = maxrow, col = mincol; row >= minrow  && count < totalCount; row--){
			System.out.print(matrix[row][col] + " ");
			count++;
		}
     }
    
}