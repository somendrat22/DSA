// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class Main {
  static int[] calSum(int arr1[], int arr2[], int n, int m) {
    int len = Math.max(arr1.length, arr2.length);
	int [] arr3 = new int[len]; // resultant array 
	int i = arr1.length - 1;
	int j = arr2.length - 1;
	int k = arr3.length - 1;
	int carry = 0;
	while(i >= 0 || j >= 0 || k >= 0){
		int val1 = 0; // i -> -1
		if(i >= 0){
			val1 = arr1[i];
		}
		int val2 = 0;
		if(j >= 0){
			val2 = arr2[j];
		}
		int sum = val1 + val2 + carry;
		int placeValue  = sum%10;
		carry = sum/10;
		arr3[k] = placeValue;
		i--;
		j--;
		k--;
	}
	  if(carry == 0){
		  return arr3;
	  }
	  int [] narr = new int[len + 1];
	  narr[0] = carry;
	  k = 0;
	  for(int y  = 1; y < narr.length; y++){
		  narr[y] = arr3[k];
		  k++;
	  }

	  return narr;
	  
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}
