import java.util.*;

public class Main {
    
    static void ptice(int n, String key) {
        // Write your code here and print output in this function
		String adrianP = "ABC";
		String brunoP = "BABC";
		String goranP = "CCAABB";
		int [] scores = new int[3];
		// 0th -> Adrians
		// 1st -> Bruno
		// 2nd -> Goran
		for(int i = 0; i < key.length(); i++){
			char correctAns = key.charAt(i);
			int adrianIDx = i%adrianP.length();
			if(correctAns == adrianP.charAt(adrianIDx)){
				scores[0]++;
			}
			int brunoIdx = i%brunoP.length();
			if(correctAns == brunoP.charAt(brunoIdx)){
				scores[1]++;
			}
			int goranIdx = i%goranP.length();
			if(correctAns == goranP.charAt(goranIdx)){
				scores[2]++;
			}
		}

		int max = 0;

		for(int i = 0; i < scores.length; i++){
			if(max < scores[i]){
				max = scores[i];
			}
		}

		System.out.println(max);

		if(scores[0] == max){
			System.out.println("Adrian");
		}

		if(scores[1] == max){
			System.out.println("Bruno");
		}

		if(scores[2] == max){
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
