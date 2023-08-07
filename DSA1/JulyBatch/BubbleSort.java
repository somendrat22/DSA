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

    public static void bubbleSort(int N, int[] arr) {
		
        for(int itr  = 0; itr < arr.length - 1; itr++){
			int lastIdx = arr.length - itr - 1;
			// [8, 5, 10]
			//  0  1   2
			for(int i  = 0; i < lastIdx; i++){
				if(arr[i] > arr[i + 1]){
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
    }
}
