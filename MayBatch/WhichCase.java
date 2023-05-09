import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); // Z
		int asciiValue = (int) ch; // 90
		if(asciiValue >= 97 && asciiValue <= 122){
			System.out.println(0);
		}else if(asciiValue >= 65 && asciiValue <= 90){
			System.out.println(1);
		}else{
			System.out.println(-1);
		}
    }
}