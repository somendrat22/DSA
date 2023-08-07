import java.util.*;

public class Main {
    public static int[] SelectionSort(int[] arr) {
        for(int itr  = 0; itr < arr.length - 1;  itr++){
			int minIdx = itr;
			int minValue = arr[itr];
			for(int i =  itr; i < arr.length; i++){
				if(minValue > arr[i]){
					minValue = arr[i];
					minIdx = i;
				}
			}

			int temp = arr[minIdx];
			arr[minIdx] = arr[itr];
			arr[itr] = temp;

			
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
