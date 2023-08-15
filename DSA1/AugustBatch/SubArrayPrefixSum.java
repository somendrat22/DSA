import java.io.*;
import java.util.*;

public class Main {

    public static int subarrayDivisbleByK(int arr[], int n, int k){
		int [] prefixSum = new int[n];
		prefixSum[0] = arr[0]; // 0 to 0 -> 4
		for(int i  = 1; i < n; i++){
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		int count  = 0;
        for(int st  = 0; st < arr.length; st++){
			for(int en = st; en < arr.length; en++){
				// st, en
				int sum  = 0;
				if(st == 0){
					sum = prefixSum[en];
				}else{
					sum = prefixSum[en] - prefixSum[st - 1];
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
