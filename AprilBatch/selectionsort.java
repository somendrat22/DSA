import java.util.*;

public class Main {
    public static int[] SelectionSort(int[] arr) {
        for(int itr = 0; itr < arr.length - 1; itr++){
			int min = Integer.MAX_VALUE;
			int minIdx = -1;
			for(int i  = itr + 1; i < arr.length; i++){
				if(min > arr[i]){
					min = arr[i];
					minIdx = i;
				}
			}
			if(min < arr[itr]){
				int temp = arr[itr];
				arr[itr] = arr[minIdx];
				arr[minIdx] = temp;
			}
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