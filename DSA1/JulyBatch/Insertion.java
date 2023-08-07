import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        
        insertionSort(array,n);
    }
	 static void insertionSort(int a[], int n)
    {
		
		// 1 6 5 8 4 9
		// 0 1 2 3 4 5
        for(int i = 1; i < a.length; i++){
			// i  = 3
			// j =  2
			int val = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > val){
				// shifting 
				a[j + 1] = a[j];
				a[j] = val;
				j--;
			}
		}

		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
    }
}
