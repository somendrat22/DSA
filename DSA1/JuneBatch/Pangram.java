import java.util.*;
import java.io.*;

public class Main {
     public  static void isPangram(String s)
    {
           s = s.toLowerCase();
		   for(int i = 0;  i < 26; i++){
			   char ch = (char)(i + 'a'); // searchCharacter // ad
			   boolean flag = false;
			   for(int j  = 0; j < s.length(); j++){ // aman
				   char strCh = s.charAt(j); 
				   if(ch == strCh){
					   flag = true;
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
