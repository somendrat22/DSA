import java.io.*;
import java.util.*;


public class Main {

    public static void reverseArray(int arr[], int start, int end)
    {

		//System.out.println("arr memory adress" + arr);
       int i = 0; // staring of the array 
	   int j = arr.length - 1; // ending of the array 
	   while(i < j){// Till the time i < j we have to swap the elements 
		   // but when i and j will cross each other it means left and 
		   // right part got swapped and we have to stop the work

		   int temp = arr[i];
		   arr[i] = arr[j];
		   arr[j] = temp;
		   i++;
		   j--;
		   
	   }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        //System.out.println("arr1 memory address" +  arr1);
        reverseArray(arr1, 0, n-1);
        
        for (int i = 0; i < n; i++)
             System.out.print(arr1[i] + " ");       
        System.out.println('\n');
    }
}
