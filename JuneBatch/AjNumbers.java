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


	public static boolean isAj(long num, long [] ajs){
		if(num == 0 || num == 1){
			return false;
		}

		for(int i  = 0; i < ajs.length; i++){
			if(ajs[i] == num){
				return true;
			}
			if(num%ajs[i] == 0){
				return false;
			}
		}


		return true;
		
	}

	public static boolean isSafe(boolean [] history, int st, int en){
		for(int i  = st; i < en;  i++){
			if(history[i] == true){
				return false;
			}
		}
		return true;
	}
    public static void solve(StringBuilder str,int n){
        // WRITE YOUR CODE HERE
		long [] ajs = {2,3,5,7,11,13,17,19,23,29};
		boolean [] history = new boolean[n];
		int count  = 0;
		for(int len = 1; len <= str.length(); len++){
			// len = 1
			for(int i = 0; i <= str.length() - len; i++){
				String sub = str.substring(i, i + len); //"423"
				long num = Long.parseLong(sub); // 423

				if(isAj(num, ajs) == true && isSafe(history, i, i + len) == true){
					count++;
					for(int j = i; j < i + len; j++){
						history[j] = true;
					}
				}
				
			}
		}

		System.out.println(count);
    }
}
