import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        starPyramid(n);
        sc.close();
    }
	public static void starPyramid(int n){
		int outerSpace = n - 1;
		int innerSpace = 0;
		for(int i = 1; i<=n-1; i++){
			for(int j = 1; j<=outerSpace; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1; j<=innerSpace; j++){
				System.out.print("  ");
			}
			if(i != 1){
				System.out.print("*");
			}
			
			outerSpace--;
			System.out.println();
			innerSpace += 1;
		}

		for(int i = 1; i<=n; i++){
			System.out.print("* ");
		}
	}
}

