import java.util.*;
import java.io.*;

public class Main {
     public  static void isPangram(String s)
    {
           // Your code here
		boolean [] arr = new boolean[26];
		//[F, F, F, T]
		// It contains by default vaule as false 
		for(int i  = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			// 'D' , 'd' -> 3
			if(ch >= 'a' && ch <= 'z'){
				// 'd' - 'a' 3
				int idx = ch - 'a';
				arr[idx] = true;
			}else if(ch >= 'A' && ch <= 'Z'){
				int idx = ch - 'A';
				arr[idx] = true;
			}
		}

		for(int i = 0; i < 26; i++)
		{
			if(arr[i] == false){
				System.out.println("not pangram");
				return;
			}
		}

		System.out.println("pangram");
    }
    public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);
        
    }
}
