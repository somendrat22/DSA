import java.util.*;

public class Main {
    
    static void ptice(int n, String key) {
		int [] scores = new int[3];
		String aPattern = "ABC";
		String bPattern = "BABC";
		String gPattern = "CCAABB";

		for(int i = 0; i < key.length(); i++){
			char correctAns = key.charAt(i);

			char aAns = aPattern.charAt(i%aPattern.length());
			if(aAns == correctAns){
				scores[0]++;
			}
			char bAns = bPattern.charAt(i%bPattern.length());
			if(bAns == correctAns){
				scores[1]++;
			}

			char gAns = gPattern.charAt(i%gPattern.length());
			if(gAns == correctAns){
				scores[2]++;
			}
		}

		int max = 0;
		for(int i = 0; i < scores.length; i++){
			max = Math.max(max, scores[i]);
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
