import java.util.*;

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 0; row < n; row++){
			char ch = (char)(row + 'A');
			for(int col = 0; col <= row; col++){
				System.out.print(ch);
			}
			System.out.println();
		}
    }
}
