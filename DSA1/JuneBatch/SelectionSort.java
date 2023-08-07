import java.util.*;

public class Main {
	public static void swap(int idx1, int idx2, int [] arr){
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
    public static int[] SelectionSort(int[] arr) {

		// Arrays.sort(arr);
        for(int itr = 0; itr < arr.length - 1; itr++){
			int minVal = arr[itr];
			int minIdx = itr;
			for(int j = itr; j < arr.length; j++){
				if(arr[j] < minVal){
					minVal = arr[j];
					minIdx = j;
				}
			}

			swap(minIdx, itr, arr);
			
		}

		return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}
