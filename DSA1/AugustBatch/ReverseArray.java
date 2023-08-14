import java.io.*;
import java.util.*;


public class Main {

    public static void reverseArray(int arr[], int start, int end)
    {
        int st = 0;
		int en = arr.length - 1;
		while(st < en){
			int temp = arr[st];
			arr[st] = arr[en];
			arr[en] = temp;
			st++;
			en--;
		}
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        
        reverseArray(arr1, 0, n-1);
        
        for (int i = 0; i < n; i++)
             System.out.print(arr1[i] + " ");       
        System.out.println('\n');
    }
}
