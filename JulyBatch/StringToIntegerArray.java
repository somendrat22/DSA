import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer> arrayGenerator(String s){

		ArrayList<Integer> res = new ArrayList<>();

		int i  = 0;
		int j  = 0;
		while(j < s.length()){
			char ch = s.charAt(j);
			if(ch  == ','){
				String subNum = s.substring(i, j);
				int num = Integer.parseInt(subNum);
				res.add(num);
				j++;
				i = j;
			}else{
				j++;
			}
		}
		String subNum = s.substring(i, j);
		int num = Integer.parseInt(subNum);
		res.add(num);
		return res;
		
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String s = input.nextLine();
            ArrayList<Integer> ans = arrayGenerator(s);
            System.out.print("[");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i));
                if (i != ans.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        
    }
}
