import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); // 18 -> 2 to 16 -> 15 , 4   
		// PrimeNumber -> 1 , 17 -> Factors -> 
// [2, 16]
		int factors = 2;
		int squareRoot = (int)Math.sqrt(n);
		// div*div <= n -> SquareRoot 
		for(int div = 2; div <= squareRoot;div++){ // Travell from 2 to 16
			int rem = n%div; // n -> 2, 3, 4, 5
			if(rem  == 0){
				factors++;
				break; // That will take you out from the while loop 
			}
			
		}
		if(n == 1){
			System.out.println("Niether prime nor composite");
		}else if(factors > 2){
			System.out.println(n + " is not a prime number");
		}else{
			System.out.println(n + " is a prime number");
		}
    }
}
