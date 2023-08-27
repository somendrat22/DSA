import java.util.*;

public class Main {
	 static int[] Sorting01(int n,int[] arr){
        int i = 0;
		int j = 0;


		 while(j < arr.length){
			 if(arr[j] == 0){

				 int temp = arr[j];
				 arr[j] = arr[i];
				 arr[i] = temp;
				 i++;
				 j++;
				 
				 
			 }else{
				 j++;
			 }
		 }

		 return arr;
		 
    }
	
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int[] ans=Sorting01(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
