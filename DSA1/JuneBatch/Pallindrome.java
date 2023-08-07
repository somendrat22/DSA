import java.io.*;
import java.util.*;

public class Main {
	static int isPalindrome(String str)
    {
	    String nstr = ""; 

		for(int i  = 0; i < str.length(); i++){  
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				nstr += ch;
			}else if(ch >= 'A' && ch <= 'Z'){
				nstr += (char)(ch - 'A' + 'a');
			}
		}

		int st  = 0;
		int en = nstr.length() - 1;  / 
		while(st < en){ // o(n/2);
			char ch1 = nstr.charAt(st);
			char ch2 = nstr.charAt(en);
			if(ch1 != ch2){
				return 0;
			}
			st++;
			en--;
		}
		// o(n + n/2)
		return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }
}
