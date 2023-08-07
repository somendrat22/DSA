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
		if(num == 0 || num == 1){
			return false;
		}
		long [] ajNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

		for(int i = 0; i < ajNumber.length; i++){
			if(num == ajNumber[i]){
				return true;
			}
			if(num%ajNumber[i] == 0){
				return false;
			}
		}

		return true;
		
		
	}


	public static boolean isDigitUsed(int st, int en,  boolean [] history){
		for(int i = st; i < en; i++){
			if(history[i] == true){
				return true;
			}
		}
		return false;
	}


	public static void markTrue(int st, int en, boolean [] history){
		for(int i = st; i < en ; i++){
			history[i] = true;
		}
	}
	
    public static void solve(StringBuilder str,int n){
		int count = 0;
		boolean [] history = new boolean[str.length()];
        for(int len = 1; len <= str.length(); len++){
			for(int st = 0; st <= str.length() - len; st++){
				String sub = str.substring(st, st + len);
				long num = Long.parseLong(sub);
				if(isAj(num) == true && isDigitUsed(st, st + len, history) == false){
					count++;
					markTrue(st, st + len, history);
				}
			}
		}


		System.out.println(count);
    }
}import java.util.*;
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
		if(num == 0 || num == 1){
			return false;
		}
		long [] ajNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

		for(int i = 0; i < ajNumber.length; i++){
			if(num == ajNumber[i]){
				return true;
			}
			if(num%ajNumber[i] == 0){
				return false;
			}
		}

		return true;
		
		
	}


	public static boolean isDigitUsed(int st, int en,  boolean [] history){
		for(int i = st; i < en; i++){
			if(history[i] == true){
				return true;
			}
		}
		return false;
	}


	public static void markTrue(int st, int en, boolean [] history){
		for(int i = st; i < en ; i++){
			history[i] = true;
		}
	}
	
    public static void solve(StringBuilder str,int n){
		int count = 0;
		boolean [] history = new boolean[str.length()];
        for(int len = 1; len <= str.length(); len++){
			for(int st = 0; st <= str.length() - len; st++){
				String sub = str.substring(st, st + len);
				long num = Long.parseLong(sub);
				if(isAj(num) == true && isDigitUsed(st, st + len, history) == false){
					count++;
					markTrue(st, st + len, history);
				}
			}
		}


		System.out.println(count);
    }
}
