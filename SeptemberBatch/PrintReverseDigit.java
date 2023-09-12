import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int totalDigits = 0;
		int num = n;
		while(num > 0){
			int rem = num%10;
			int q = num/10;
			num = q;
			totalDigits++;
		}

		int reverseNum = 0;
		while(num > 0){
			int rem = num%10;
			int q = num/10;
			num = q;
			int calc = rem*(int)Math.pow(10, totalDigits - 1);
			reverseNum += calc;
			totalDigits--;
		}

		System.out.println(reverseNum);

		
    }
}
