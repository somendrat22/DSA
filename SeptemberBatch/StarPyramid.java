import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaceCount = n - 1;
		int starCount = 1;

		for(int row = 1; row <= n; row++){
			// First I have to print spaces 
			for(int sp = 1; sp <= spaceCount; sp++){
				System.out.print(" ");
			}
			// I have to print star 
			for(int st = 1; st <= starCount; st++){
				System.out.print("* ");
			}

			starCount++;
			spaceCount--;
			System.out.println();
			
		}
    }
}
