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

	
	// true -> When at any of the index true is present that means that index is used by other Aj Number 
	public static boolean isConsumed(boolean [] history, int st, int en){
		for(int i  = st; i < en; i++){
			if(history[i] == true){
				return true;
			}
		}
		return false;
	}


	// true -> When number is Aj Number 
	// false -> When number is not an Aj Number 
	public static boolean isAj(long num){
		long [] ajs = {2,3,5,7,11,13,17,19,23,29};
		if(num  == 0 || num == 1){
			return false;
		}

		for(int i  = 0; i < ajs.length; i++){
			if(num == ajs[i]){
				return true; // number is present in the set that means it is aj number 
				
			}

			if(num%ajs[i] == 0){
				return false;
			}
		
		}


		return true;
	}
	
    public static void solve(StringBuilder str,int n){
		int count  = 0;
		boolean [] history = new boolean[str.length()];
		for(int len = 1; len <= str.length(); len++){
			// len  -> 1
			// 0 to 5
			// len -> 2
			// 0 to 6 - 2; 0 to 4
			for(int st  = 0; st <= str.length() - len; st++){
				String sub = str.substring(st, st + len);
				// String -> Integer (Long)
				long num  = Long.parseLong(sub);

				if(isAj(num) == true && isConsumed(history, st, st + len) == false){
					count++;
					for(int i = st; i < st + len; i++){
						history[i] = true;
					}
				}
			}


		}
					System.out.println(count);
    }
}
