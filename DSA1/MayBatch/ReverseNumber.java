import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int x = n;
		String ans = "";
		while(n != 0){
			int rem = n%10;
			int q = n/10;
			n = q;
			ans = ans + rem;
		}
		if(x == 0){
			System.out.println(0);
		}else{
			System.out.println(Integer.parseInt(ans));
		}
		
	}
}