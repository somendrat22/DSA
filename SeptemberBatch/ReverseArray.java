import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        solve();
    }

		public static void swap(int i, int j, int [] arr){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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

	public static void reverseArray(int st, int en, int[] arr){
		int i = st;
		int j = en;
		// Till when we should swap left side with right side;
		// condition ? 
		// i < j -> swap left part with right part 
		while(i < j){
			swap(i, j, arr);
			i++;
			j--;
		}
	}

    public static void rotateArray(int arr[], int n, int k) {
        // 1st step reverse whole array
		k = k%n;
		reverseArray(0, arr.length - 1, arr);
		// 2nd step reverse 2nd part
		int st2 = arr.length - k;
		int en2 = arr.length - 1;
		reverseArray(st2, en2, arr);
		// 3rd step to reverse 1st part
		int st1 = 0;
		int en1 = arr.length - k - 1;
		reverseArray(st1, en1, arr);

		for(int i  = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
    }

}

