import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public void merge(int[][] intervals) {
		  // Sort Array on the basis of Starting Time
	      Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]); // Array will get sorted on the basis of 0th column

		  Stack<int []> mergeStack = new Stack<>();

		  mergeStack.push(intervals[0]);

		  for(int i  =  1; i < intervals.length; i++){
			  int [] i1 = mergeStack.peek(); // prev Interval // Address of the array that is stored of the peek 
			  int [] i2 = intervals[i];

			  int st1 = i1[0];
			  int en1 = i1[1];
			  int st2 = i2[0];
			  int en2 = i2[1];

			  // Non OverLapping 
			  if(en1 < st2){
				  // Both intervals are non overLapping
				  // i1 can't 
	             mergeStack.push(i2);
			  }else{
				  // Both intervals are overlapping 
				  int max = Math.max(en1, en2);
				  // You don't need to update starting point because ? Array is already sorted on the basis of staring poiny
				  // But we need to update ending point -> We never no what kind of intervals we are getting 
				  // For example : [1, 9] -> i1 [2, 8] -> i2  i1  -> [1, 3] i2 -> [2, 4]
				  // i1 -> 
				  i1[1] = Math.max(en1, en2); // By this statement automatically interval that is present at the stack top will get updated 	  
			  }
				  
		  }


		// Stack.size() -> Number of non overlapping intervals 

		
		int [][] ans = new int[mergeStack.size()][2];

		for(int i = ans.length - 1; i >= 0; i--){
			int [] interval = mergeStack.pop();
			ans[i] = interval;
		}


		for(int i = 0; i < ans.length; i++){
			System.out.println(ans[i][0] + " " + ans[i][1]);
		}
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        int[][] A = new int[m][2];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        Obj.merge(A);
        
    }
}
