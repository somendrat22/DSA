import java.util.*;
import java.io.*;

public class Main {
     public  static void isPangram(String s){
          s = s.toLowerCase(); // String will get converted into lower case;

		 for(int i  = 0; i < 26; i++){
			 char ch = (char)(i + 'a'); // i = 0 -> 0 + 'a' -> 'a'
			 // i = 1 -> 1 + 'a' -> 'b'
			 boolean flag = false; // flag false represents english character is not present in the string 
			 for(int j  = 0; j < s.length(); j++){
				 char sCh = s.charAt(j);
				 if(ch == sCh){
					 flag = true; // Whatever the english character which we are searching is present in my string 
					 break;
				 }
			 }
			 if(flag == false){
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
