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
        for(int i  = 1; i < a.length; i++){
			int j = i - 1;
			int val = a[i];
			while(j >= 0 && a[j] > val){
				a[j + 1] = a[j];
				a[j] = val;
				j--;
			}  
			// 1st condition -> j -> -1 : the correct position of the val is 0th index 
			// 2nd condition -> a[j] < val -> val correct position is j + 1

		}
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
    }
}
