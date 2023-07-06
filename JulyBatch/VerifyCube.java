import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

		long lhs = (a + b)*(a + b)*(a + b);
		long rhs = a*a*a + b*b*b + 3*a*a*b + 3*a*b*b;
		// We use single = to assign values

		System.out.println(lhs);
		System.out.println(rhs);
		if(lhs == rhs){
			System.out.println("VERIFIED");
		}else{
			System.out.println("NOT VERIFIED");
		}
        
    }
}