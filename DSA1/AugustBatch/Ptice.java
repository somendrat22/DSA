import java.util.*;

public class Main {
    
    static void ptice(int n, String key) {
        // Write your code here and print output in this function
		String adrianP = "ABC";
		String brunoP = "BABC";
		String goranP = "CCAABB";

		int [] scores = new int[3];
		// 0 -> score of adrian
		// 1 -> score of bruno
		// 2 -> score of goran 

		for(int i  = 0; i < key.length(); i++){
			// i -> question number 
			char correctAns = key.charAt(i);
			// 7%3 -> 1
			if(correctAns == adrianP.charAt(i%adrianP.length())){
				scores[0] +=  1;
			}

			if(correctAns == brunoP.charAt(i%brunoP.length())){
				scores[1] +=  1;
			}

			if(correctAns == goranP.charAt(i%goranP.length())){
				scores[2] += 1;
			}
		}

		int max  = 0;

		for(int i = 0; i < scores.length; i++){
			max = Math.max(max, scores[i]);
		}
		System.out.println(max);	
		if(max == scores[0]){
			System.out.println("Adrian");
		}
		if(max == scores[1]){
			System.out.println("Bruno");
		}
		if(max == scores[2]){
			System.out.println("Goran");
		}
		
    }  
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        ptice(n, str);
        sc.close();
    }
}
