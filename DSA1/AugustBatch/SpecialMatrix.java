import java.io.*;
import java.util.*;

class Solution{
    static boolean special(int matrix[][], int n){
        for(int i  = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(i == j ||i + j == matrix.length - 1){
					if(matrix[i][j] == 0){
						return false;
					}
				}else{
					// Non Diagnol Element 
					if(matrix[i][j] != 0){
						return false;
					}
					
				}
			}
		}

		return true;
        
    }
}
class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            boolean ans = ob.special(matrix, n);
            System.out.println(ans);
        }
    }
}
