import java.util.*;

public class Main {
    
    static void ptice(int n, String key) {
       int [] scores = new int[3]; // [0, 0, 0]
	   // 0 -> Adrian's Score
	   // 1 -> Bruno Score 
	   // 2 -> Goran's Score 

	  String adrainP = "ABC"; // 3
	  String brunoP = "BABC";
	  String goranP = "CCAABB";

		// n = 10
		for(int i = 0; i < key.length(); i++){
			char correctAns = key.charAt(i); // It is giving us correct ans for particular ith question 
            // i = 2 -> 2%3 ->, i = 7 -> 7%3 -> 2
			char adrianAns = adrainP.charAt(i%adrainP.length()); // i can get out of bound for adrian 

			if(adrianAns == correctAns){
				scores[0]++;
			}

			char brunoAns = brunoP.charAt(i%brunoP.length());

			if(brunoAns == correctAns){
				scores[1]++;
			}

			char goranAns = goranP.charAt(i%goranP.length());

			if(goranAns == correctAns){
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
