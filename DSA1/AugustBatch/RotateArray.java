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

	public static void reverse(int [] arr, int st, int en){
		while(st < en){
			int temp = arr[st];
			arr[st] = arr[en];
			arr[en] = temp;
			st++;
			en--;
		}
	}
    public static void rotateArray(int arr[], int n, int k) {
        // Reverse whole Array 
		reverse(arr, 0, n - 1); // This is going to reverse whole array
		// Reverse the k elememts from the end  why ? Because they are present in the reversed order
		reverse(arr, n - k, n - 1);
		// Reverse the starting n - k elements ? Because they are also in the reversed order 
		reverse(arr, 0, n - k - 1);
    }

}

