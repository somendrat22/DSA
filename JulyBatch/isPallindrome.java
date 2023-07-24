import java.io.*;
import java.util.*;

public class Main {
	public static String removeUnwantedCharacters(String str){
		String nstr  = "";
		for(int i  = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				char lowerCase = (char)(ch - 'A' + 'a');
				nstr += lowerCase;
			}else if(ch >= 'a' && ch <= 'z'){
				nstr += ch;
			}
		}
		return nstr;
	}
	static int isPalindrome(String str)
    {
		  String upStr = removeUnwantedCharacters(str);
		  int st  = 0;
		  int en = upStr.length() - 1;
          int res = 1; // 1 represent pallindrome & 0 represents not pallindrome 
		  while(st < en){
			  char ch1 = upStr.charAt(st);
			  char ch2 = upStr.charAt(en);
			  if(ch1 != ch2){
				  res  = 0;
				  break;
			  }
			  st++;
			  en--;
		  }

		return res;
		
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }
}
