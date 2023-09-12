import java.util.*;

public class Main {
    public static void main(String args[]) {
       Scanner scn = new Scanner(System.in);
	   int n = scn.nextInt();
	   long mul = 1; // factorial Value is stored
	   int num = 1;
	   while(num <= n){
		   mul = mul*num;
		   num = num + 1;
	   }
	 System.out.println(mul);
    }
}
