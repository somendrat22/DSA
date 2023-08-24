import java.util.*;
import java.io.*;

public class Main {
     public  static void isPangram(String s){

		 s = s.toLowerCase();

		 // 
		 boolean [] arr = new boolean[26];

		 for(int i  = 0; i < s.length(); i++){
			 
			 char ch = s.charAt(i);
			 if(ch == ' '){
				 continue;
			 }
			 int idx = ch - 'a';
			 arr[idx] = true;
		 }

		 for(int i = 0; i < 26; i++){
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
