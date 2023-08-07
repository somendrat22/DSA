import java.io.*;
import java.util.*;


public class Main {
    public static void SecondLargest(int[] arr, int n) {
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
        for(int i  = 0; i < arr.length; i++){
		  if(arr[i] > firstMax){
			  secondMax = firstMax;
			  firstMax = arr[i];
		  }else if(arr[i] > secondMax){
			  secondMax = arr[i];
		  }
	  }
      System.out.println(secondMax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        SecondLargest(arr,n);
        sc.close();
        
    }
}
