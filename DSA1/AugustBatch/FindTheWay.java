import java.util.*;

public class Main {
    public static int[] findTheWay(int[][] matrix) {
        int dir  = 0;
		int i  = 0; 
		int j  = 0;
		while(i >= 0 && j >= 0 && i < matrix.length && j < matrix[0].length){

			if(matrix[i][j] == 1){
				dir++;
				dir = dir%4;
			}
			
			if(dir == 0){
				j++;
			}else if(dir == 1){
				i++;
			}else if(dir == 2){
				j--;
			}else{
				i--;
			}
		}

		if(j == matrix[0].length){
			j--;
		}else if(j == -1){
			j++;
		}else if(i == matrix.length){
			i--;
		}else{ // i == -1
			i++;
		}

		int [] ans = {i, j};
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
