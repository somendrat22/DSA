import java.util.*;

public class Main {


	public static long calcFactorial(int som){
		   long mul = 1; // factorial Value is stored
		   int num = 1;
		   while(num <= som){
			   mul = mul*num;
			   num = num + 1;
		   }

		  return mul;

	}
    static long calculate_nCr(int n, int r) {
        // write code here
		// n!
		// r!
		// (n - r)!

		long nFact = calcFactorial(n);
		long rFact = calcFactorial(r);
		long n_rFact = calcFactorial(n - r);

		long ncr = nFact/(rFact*n_rFact);

		return ncr;
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        long ans = calculate_nCr(n,r);
        System.out.print(ans);
    }
}
