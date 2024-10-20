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
        int maxRow = matrix.length - 1;
        int minCol = 0;
        int maxCol = matrix[0].length - 1;

        int totalElements = 2*(matrix.length + matrix[0].length) - 4;
        if(minRow == maxRow){
            totalElements = matrix[0].length;
        }
        if(minCol == maxCol){
            totalElements = matrix.length;
        }
        int count = 0;
        for(int col = minCol; col <= maxCol && count < totalElements; col++){
            System.out.print(matrix[minRow][col] + " ");
            count++;
        }
        minRow++;
        for(int row = minRow; row <= maxRow  && count < totalElements; row++){
            System.out.print(matrix[row][maxCol] + " ");
            count++;
        }
        maxCol--;
        for(int col = maxCol; col >= minCol &&  count < totalElements; col--){
            System.out.print(matrix[maxRow][col] + " ");
            count++;
        }
        maxRow--;
        for(int row = maxRow; row >= minRow && count < totalElements; row--){
            System.out.print(matrix[row][minCol] + " ");
            count++;
        }
    }
}
