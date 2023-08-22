import java.io.*;
import java.util.*;

public class Main {
	public static int triplets(ArrayList<Integer> arr, int X) {
		int count  = 0;
		int prevVal1 = -1;
	    for(int i  = 0; i < arr.size(); i++){
			int val1 = arr.get(i);
			if(prevVal1 == val1){
				continue;
			}
			prevVal1 = val1;
			int upTgt = X - val1;
			int st = i + 1;
			int en = arr.size() - 1;
			// Pair Sum;
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
				if(val2 + val3 == upTgt){
					count++;
					prevSt = val2;
					prevEn = val3;
					st++;
					en--;
				}else if(val2 + val3 < upTgt){
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
