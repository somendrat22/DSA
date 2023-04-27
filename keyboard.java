import java.io.*;
import java.util.*;

public class Main {
	static boolean isExist(boolean [] row, String str){
		for(int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(row[ch - 'a'] == false){
				return false;
			}
		}
		return true;
		
	}
    static ArrayList<String> getStrings(ArrayList<String> arr)
    {
		ArrayList<String> ans =  new ArrayList<>();
		String s1 = "qwertyuiop";
		String s2 = "asdfghjkl";
		String s3 = "zxcvbnm";
		boolean [] row1 = new boolean[26];
		for(int i  = 0; i<s1.length(); i++){ // s1
			char ch = s1.charAt(i); //q 
			int idx = ch - 'a'; // q - a = 15
			row1[idx] = true;
		}
		boolean [] row2 = new boolean[26];
		for(int i  = 0; i<s2.length(); i++){ // s1
			char ch = s2.charAt(i); //q 
			int idx = ch - 'a'; // q - a = 15
			row2[idx] = true;
		}
		boolean [] row3 = new boolean[26];
		for(int i  = 0; i<s3.length(); i++){ // s1
			char ch = s3.charAt(i); //q 
			int idx = ch - 'a'; // q - a = 15
			row3[idx] = true;
		}

		for(String str : arr){
			boolean res1 = isExist(row1, str);
			boolean res2 = isExist(row2, str);
			boolean res3 = isExist(row3, str);
			if(res1 == true || res2 == true || res3 == true){
				ans.add(str);
			}
		}
		return ans;
		
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            arr.add(s);
        }

        ArrayList<String> result = getStrings(arr);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
