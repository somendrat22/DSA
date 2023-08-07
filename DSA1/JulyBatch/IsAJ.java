import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        StringBuilder str=new StringBuilder(input.nextLine());
        
        solve(str,n);

        input.close();
    }


	public static boolean isAj(long num){
		long [] ajs = {2,3,5,7,11,13,17,19,23,29};

		if(num == 0 || num == 1){
			return false;
		}
		for(int  i = 0;  i< ajs.length; i++){
			if(num == ajs[i]){
				return true;
			}
			if(num%ajs[i] == 0){
				return false;
			}
		}

		return true;
	}

	public static boolean isDigitUsed(int st, int en, boolean [] history){
		for(int i = st; i <= en; i++){
			if(history[i] == true){
				return true;
			}
		}
		return false;
	}
	
    public static void solve(StringBuilder str,int n){
        // WRITE YOUR CODE HERE
		int count = 0;
		boolean [] history = new boolean[str.length()];
		for(int len = 1; len <= str.length(); len++){
			int endingIndex = str.length() - len;
			for(int st  = 0; st <= endingIndex; st++){
				String sub = str.substring(st, st + len);
				long num = Long.parseLong(sub);
				if(isAj(num) == true && isDigitUsed(st, st+len - 1, history) == false){
					//System.out.println(sub);
					count++;
					for(int i  = st; i < st+len; i++){
						history[i] = true;
					}
				}
			}
		}
	System.out.println(count);
    }
}
