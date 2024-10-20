import java.util.*;

public class Main {
    public static int[] findTheWay(int[][] matrix) {
        //Write code here
		int row = 0;
		int col = 0;
		int dir = 0;
		while(row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length){
			int val = matrix[row][col];

			if(val == 1){
				dir++;
				dir = dir%4;
			}

			if(dir == 0){
				col++;
			}
			if(dir == 1){
				row++;
			}
			if(dir == 2){
				col--;
			}
			if(dir == 3){
				row--;
			}
		}

		if(row == matrix.length){
			row--;
		}else if(row == -1){
			row++;
		}else if(col == matrix[0].length){
			col--;
		}else{
			col++;
		}

		int [] ans = {row, col};
		return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
		}
        int result[] = findTheWay(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}