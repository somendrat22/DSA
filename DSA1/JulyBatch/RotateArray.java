import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // No. of times to rotate
        rotateArray(arr, n, k);
    }


	public static void reverseArray(int [] arr, int st, int en){
		while(st < en){
			int temp = arr[st];
			arr[st] = arr[en];
			arr[en] = temp;
			st++;
			en--;
		}
	}

    public static void rotateArray(int arr[], int n, int k) {
        // Write code here

		// Reverse Complete array 
		reverseArray(arr, 0, arr.length  - 1);
		// Reverse the array from 0 to n (ending index)  - k
		reverseArray(arr, 0, arr.length - 1 - k);
		// Reverse the array from n - k + 1 to n (ending index);
		reverseArray(arr, arr.length - 1 - k + 1, arr.length - 1);


		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
    }

}

