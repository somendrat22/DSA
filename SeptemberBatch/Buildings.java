import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

   
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    barGraph(arr, n);
  }

  public static void barGraph(int[] arr, int n) {

	  // +infinity -> Integer.MAX_VALUE
      // -
	  int maxHeight = Integer.MIN_VALUE; // - infinity 

	  for(int i  = 0; i < arr.length; i++){
		  // arr[i] -> height of ith index building 
		  if(arr[i] > maxHeight){ // ith index building -> height 
			  maxHeight = arr[i];
		  }
	  }

	  // Top to bottom 

	  // currFloor ? 

	  int currFloor = maxHeight; // 9th 


	  // Till first floor our construction should go on 
	
	  while(currFloor >= 1){
		  // currFloor -> 9
		  for(int i  = 0; i < arr.length; i++){
			  if(arr[i] >= currFloor){
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
