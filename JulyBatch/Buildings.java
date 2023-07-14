import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      max = Math.max(max, arr[i]);
    }
    sc.close();
    barGraph(arr, n);
  }

  public static void barGraph(int[] arr, int n) {
     // Integer.MAX_VALUE;
	  int max = Integer.MIN_VALUE;

	  for(int i  = 0; i < arr.length; i++){
		  if(arr[i] > max){
			  max = arr[i];
		  }
	  }

	  int currFloor = max; // 9
		  
	  while(currFloor >=  1){
		  for(int i  = 0; i < arr.length; i++){
			  if(currFloor <= arr[i]){
				  System.out.print("*\t");
			  }else{
				  System.out.print("\t");
			  }
		  }
		  System.out.println();
		  currFloor--;
	  }
    
  }
}
