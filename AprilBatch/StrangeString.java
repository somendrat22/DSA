import java.io.*;
import java.util.*;

public class Main {
    static String strangeString(int n) {
        StringBuilder ans =  new StringBuilder();
		for(int i  = 0; i<n; i++){
			int idx = i%26;
			if(i%2 == 0){
				// even
				char ch = (char)(idx + 'a');
				ans.insert(0, ch);
			}else{
				// odd
				char ch = (char)(idx + 'a');
				ans.append(ch);
			}
		}
		return ans.toString();
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
    }
}