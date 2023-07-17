import java.io.*;
import java.util.*;

public class Main {

    public static int subarrayDivisbleByK(int arr[], int n, int k){
        // Write code here 

		int count  = 0;
		for(int st = 0; st < arr.length; st++){
			for(int en = st; en < arr.length; en++){
				int sum = 0; 
				for(int i  = st; i <= en; i++){
					sum += arr[i];
				}
				if(sum%k == 0){
					count++;
				}
			}
		}
		return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int result = subarrayDivisbleByK(arr, n, k);
        System.out.print(result);        
        System.out.println('\n');
    }
}
