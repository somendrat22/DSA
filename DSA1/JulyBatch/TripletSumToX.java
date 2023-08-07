import java.io.*;
import java.util.*;

public class Main {
	public static int triplets(ArrayList<Integer> arr, int x) {
		int count  = 0;
		//int prevV1 = -1;
	    for(int i = 0; i < arr.size(); i++){
			int val1 = arr.get(i);
			if(i > 0 && arr.get(i - 1) == arr.get(i)){
				continue;
			}
			int upTgt = x - val1;
			int st = i + 1;
			int en = arr.size()  - 1;
			int prevSt = -1;
			int prevEn = -1; 
			while(st < en){
				if(prevSt == arr.get(st) && prevEn == arr.get(en)){
					st++;
					en--;
					continue;
				}
				int sum = arr.get(st) + arr.get(en);
				if(sum == upTgt){
					// You got a pair equals to updated target & you got triplet that is equal to x
					count++;
					prevSt = arr.get(st);
					prevEn = arr.get(en);
					st++;
					en--;
				}else if(sum < upTgt){
					st++;
				}else{
					en--;
				}
			}
		}

		return count;
   }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t;
    t = sc.nextInt();
    while (t > 0) {
      int n, X;
      n = sc.nextInt();
      ArrayList<Integer> arr = new ArrayList<Integer>(n);
      for (int i = 0; i < n; i++) arr.add(sc.nextInt());
      X = sc.nextInt();
      int result = triplets(arr, X);
      System.out.println(result);
      t--;
    }
    sc.close();
  }

  
}
