import java.io.*;
import java.util.*;

public class Main {
	public static int triplets(ArrayList<Integer> arr, int tgt) {
	    // your code here
		int count = 0;
		for(int i = 0; i < arr.size(); i++){
			int val1 = arr.get(i);
			if(i >= 1 && arr.get(i - 1) == val1){
				continue;
			}
			int upTgt = tgt - val1;
			int st = i + 1;
			int en = arr.size() - 1;
			int prevSt = -1;
			int prevEn = -1;
			while(st < en){
				int val2 = arr.get(st);
				int val3 = arr.get(en);
				if(prevSt == val2 && prevEn == val3){
					st++;
					en--;
					continue;
				}
				int sum  = val2 + val3;
				if(sum == upTgt){
					prevSt = val2;
					prevEn = val3;
					count++;
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
