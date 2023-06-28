import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];

        // Input of array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // bubble sort in descending order
        bubbleSort(N, arr);
        // printing array elements
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }

	public static void swap(int idx1, int idx2, int [] arr){
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

    public static void bubbleSort(int n, int[] arr) {
		// 5, 4, 0 to 3rd
        for(int itr = 0; itr < arr.length - 1; itr++){
			for(int i = 0; i < n - itr - 1; i++){
				if(arr[i] > arr[i + 1]){
					swap(i, i + 1, arr);
				}
			}
		}
    }
}
