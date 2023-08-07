// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class Main {
  static int[] calSum(int a[], int b[], int n, int m) {
	   int size = Math.max(a.length, b.length);
	   int [] ans = new int[size];
	   int i = a.length - 1;
	   int j = b.length - 1;
	   int k = ans.length - 1;
	   int carry  = 0;
	   while(i >= 0 || j >= 0){
		   int val1 = (i >= 0) ? a[i] : 0;
		   int val2 = (j >= 0) ? b[j] : 0;
		   int sum = val1 + val2 + carry;
		   int placeValue = sum%10;
		   carry = sum/10;
		   ans[k] = placeValue;
		   i--;
		   j--;
		   k--;
	   }
	  if(carry == 0){
		  return ans;
	  }
	  int [] res = new int[size + 1];
	  res[0] = carry;
	  int idx = 0;
	  for(int x = 1; x < res.length; x++){
		  res[x] = ans[idx];
		  idx++;
	  }
	  return res;
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
