import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

		int totalDigits = 0;
		int num = n;
		while(num != 0){
			num = num/10;
			totalDigits++;
		}
		k = k%totalDigits;
		if(k < 0){
			k += totalDigits;
		}
        int pow = (int) Math.pow(10, k); // 10^k
		int rem = n%pow;
		int q = n/pow;
		int finalAns = rem*(int) Math.pow(10, totalDigits - k) + q;
		System.out.println(finalAns);
    }
}
