import java.util.*;

public class Main {
	static void SubString(String str) {
		// o(n^4) //
        for(int i  = 0; i < str.length(); i++){
			for(int j = i; j <str.length(); j++){
				String sub = str.substring(i, j + 1); // o(n)
				System.out.println(sub);
			}
		}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SubString(str);
    }
}
