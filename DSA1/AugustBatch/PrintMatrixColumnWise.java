import java.util.*;

class Solution {
    public void printMatrixColumnwise(int[][] mat, int n, int m) {
		int totalRows = mat.length;
		int totalCols = mat[0].length; 
        for(int col = 0; col < totalCols; col++){ // 4*6
			// 5
			for(int row = 0; row < totalRows; row++){
				System.out.print(mat[col][row] + " ");
			}
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t > 0) {
            int n;
            int m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    matrix[i][j] = sc.nextInt();
            Solution Obj = new Solution();
            Obj.printMatrixColumnwise(matrix, n, m);
            System.out.println();
            t--;
        }
        sc.close();
    }
}
