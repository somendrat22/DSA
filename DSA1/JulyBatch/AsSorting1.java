import java.util.*;

class Solution{

	public static void bubbleSort(int  [][] mat, int col){
		int totalRows = mat.length;
		for(int itr  = 0; itr < totalRows - 1; itr++){
			int lastIndex = totalRows - itr - 1;
			for(int row = 0; row < lastIndex; row++){
				if(mat[row + 1][col] < mat[row][col]){
					int temp = mat[row][col];
				    mat[row][col] = mat[row + 1][col];
				    mat[row + 1][col] = temp;
				}
				
			}
		}

		
	}
	
    public static void sortCol(int[][] mat, int N, int M){
        for(int col = 0; col < mat[0].length; col++){
			bubbleSort(mat, col);
		}

		for(int row  = 0; row < mat.length; row++){
			for(int col = 0; col < mat[0].length; col++){
				System.out.print(mat[row][col] + " ");
			}
			System.out.println();
		}
    }
}

public class Main {
        public static void main(String[] args) throws Throwable {
         Scanner sc=new Scanner(System.in); 
          int n=sc.nextInt();
          int m=sc.nextInt();
          int[][] mat =new int[n][m]; 
          for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
          } 
          Solution.sortCol(mat, n, m);
      
        }
}
