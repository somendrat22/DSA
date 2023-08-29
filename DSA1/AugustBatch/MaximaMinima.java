import java.util.*;

public class Main {
    public static int maximaMinima(int[][] mat) {
        for(int row  =  0; row < mat.length; row++){
			int min = Integer.MAX_VALUE;
			int column = -1;
			for(int col = 0; col < mat[0].length; col++){
				if(min > mat[row][col]){
					min = mat[row][col];
					column = col;
				}
			}
			boolean flag = true; // We are assuming what ever the minimum element we got is the maxima minima of the array
			for(int i = 0; i < mat.length; i++){
				if(mat[i][column] > min){
					flag = false;
					break;
				}
			}

			if(flag == true){
				return min;
			}
		}

		return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}
