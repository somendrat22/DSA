import java.util.*;

class Solution {
    public void printElementsAlternately(int[][] mat,int m,int n) {
        //Write code here and print output
		int totalRows = mat.length;
		int totalCols = mat[0].length;

		for(int row = 0; row < totalRows; row++){
			if(row%2 == 0){
				for(int col = 0; col < totalCols; col++){
					System.out.print(mat[row][col] + " ");
				}
			}else{
				for(int col = totalCols - 1; col >= 0; col--){
					System.out.print(mat[row][col] + " ");
				}
			}
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printElementsAlternately(mat,m,n);
       
        sc.close();
    }
}

