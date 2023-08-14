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

  public static void barGraph(int[] height, int n) {

	  int max = Integer.MIN_VALUE; 
		   
      // Math.max(val1, val2)
	  for(int i  = 0; i < n; i++){
		  // [9,3, 7, 6, 2, 0, 4]
		  // max -> 9 , arr[i] -> 7
		  max = Math.max(max, height[i]);
	  }

	  // When we will come out of the for loop your max variable will be updated with the maximum value of array 

	  int currFloor = max; // I will start construction from the most highest building 

	  while(currFloor > 0){
		 // I need to visit every building i have to travel over whole array 
		  for(int i  = 0; i < height.length; i++){
			  if(height[i] >= currFloor){
				  // Ith building is having height greater or equals to my currHeight
				  // Thats why we need to construct floor for the ith building 
				  System.out.print("*\t");
			  }else{
				  // As we can't construct floor for the ith building thats why giving space of 1 tab 
				  System.out.print("\t");
			  }
		  }
		  // You have constructed particular floor for all the buildings
		  System.out.println();
		  currFloor--;
	  }

	  // You have constructed all the floors. 
  }
  
}
