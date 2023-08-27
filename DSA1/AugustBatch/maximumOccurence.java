import java.util.*;

public class Main {
    static int maximum_occurrence(int arr[], int n) {
        //Write code here

		Arrays.sort(arr); // NLOGN

		int max = 0;
		int val = -1;
		int i  = 0;
		int j  = 0;
		while(j < n){
			if(arr[i] == arr[j]){
				j++;
			}else{
				int freq = j - i;
				if(freq > max){
					max = freq;
					val = arr[i];
				}
				i = j;
			}
		}
		return val;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));

    }
}
