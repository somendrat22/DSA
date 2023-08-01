import java.util.*;

public class Main {
    public static int[] SmallestGreaterElements(int[] arr) {
        // Write your code here

		// one nested loop 
		// [13, 6, 17, 12]
		// [13, 14, 15, 19, 20]
		// njge > 13 lower limit is 13
		// we have to find minimum element which is greater than 13
        // [17, 13, 14, 21] 
		int [] ans = new int[arr.length];
		//   0   1   2   3
		for(int i = 0; i < arr.length; i++){
			// i -> 1
			int min = Integer.MAX_VALUE;  // 14
            
			for(int j = 0; j < arr.length; j++){ // j =  2
				// I want to update minimum only when arr[j] is greater tham arr[i] // 13
				// 14 > 13 && 17 > 14
				if(arr[j] > arr[i] && min  > arr[j]){
					min = arr[j];
				}
			}


			if(min == Integer.MAX_VALUE){
				ans[i] = -10000000;
			}else{
				ans[i] = min;
			}
		}

		return ans;
		
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SmallestGreaterElements(arr);
        for(int a : ans) {
            System.out.print(a + " ");
        }
    }
}
