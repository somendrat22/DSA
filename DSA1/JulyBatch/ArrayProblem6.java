import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem6(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem6(int n, int[] arr){
		int min = Integer.MAX_VALUE;
        for(int i  = 0; i < n; i++){
			if(arr[i] < 0 || arr[i]%2  != 0){
				continue;
			}
			for(int j  = i + 1; j < n; j++){
				if(arr[j] >= 0 && arr[j]%2 == 0){
					min = Math.min(min, j - i);
					break;
				}
			}
		}
		if(min == Integer.MAX_VALUE){
			return -1;
		}
		return min;
    }
}
