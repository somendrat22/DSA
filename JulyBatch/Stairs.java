import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Write your code here

		for(int row = 1; row <= n; row++){
			for(int star = 1; star <= row; star++){
				System.out.print("*");
			}
			System.out.println();
		}
    }
}
