import java.io.*;
import java.util.*;

public class Main {

	static int checkWord(String word, String row){
		// word -> tom -> t -> state++;
		// row  -> quertyuiop
	   int state = 0; 
		// state -> 0  No character of word is present in row
	   // state = word.length() -> // all characters of word are present in the row
	   //  state  < word.length() -> some charcaters are presnt in the word but some not

		for(int i = 0; i < word.length(); i++){
			char ch = word.charAt(i);
      // int idx = ch - 'a';
      // if(row[idx] == false){
        //  }

      //
			for(int j = 0; j < row.length(); j++){
				char rowCh = row.charAt(j);
				if(ch == rowCh){
					state++;
				}
			}
		}

		return state;
		
	}
    static ArrayList<String> getStrings(ArrayList<String> arr)
    {
		ArrayList<String> ans = new ArrayList<>();
		String row1 = "qwertyuiop";
		String row2 = "asdfghjkl";
		String row3 = "zxcvbnm";
		for(int i  = 0;  i<arr.size(); i++){
			String word = arr.get(i);
			int res1 = checkWord(word, row1);
			if(res1 == word.length()){
				ans.add(word);
				continue;
			}else if(res1 != 0 && res1 < word.length()){
				continue;
			}

			int res2 = checkWord(word, row2);
			if(res2 == word.length()){
				ans.add(word);
				continue;
			}else if(res2 != 0 && res2 < word.length()){
				continue;
			}

			int res3 = checkWord(word, row3);
			if(res3 == word.length()){
				ans.add(word);
				continue;
			}else if(res3 != 0 && res3 < word.length()){
				continue;
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
