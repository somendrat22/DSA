import java.util.*;

class Solution{

    public static void sort(int [][] mat, int col){
        for(int itr = 0; itr < mat.length; itr++){
            int minIDx = -1;
            int minValue = Integer.MAX_VALUE;
            for(int row = itr + 1; row < mat.length; row++){
                if(minValue > mat[row][col]){
                    minValue = mat[row][col];
                    minIDx = row;
                }
            }
            if(minValue < mat[itr][col]){
                int temp = mat[itr][col];
                mat[itr][col] = mat[minIDx][col];
                mat[minIDx][col] = temp;
            }

        }
    }

    public static void print(int [][] mat){
        for(int i  = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortCol(int[][] mat, int N, int M){
        for(int col = 0; col < mat[0].length; col++){
            sort(mat, col);
        }
        print(mat);
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
    

