import java.util.*;

public class Main {

  static int goodStrings(String s, String[] A, int n) {
	int [] freqArr = new int[26]; // ato z 
	  
    for(int i = 0; i<s.length(); i++){
		char ch = s.charAt(i);
		int idx = ch - 'a';
		freqArr[idx] += 1;
	}
	int count  = 0; // Total No. of good strings 
	for(int i = 0; i<A.length; i++){
		String str = A[i]; // ab, // abd
		boolean flag = true; // We are assuming string is good 
		for(int j = 0; j<str.length(); j++){
			char ch = str.charAt(j);
			int idx = ch - 'a';
			if(freqArr[idx] > 0){
				
			}else{
				flag = false;
				break;
			}
		}
		if(flag == true){
			count++;
		}
	}
	return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = sc.nextInt();
      String[] A = new String[n];
      for (int i = 0; i < n; i++) {
        A[i] = sc.next();
      }

      System.out.println(goodStrings(s, A, n));
    }
  }
}