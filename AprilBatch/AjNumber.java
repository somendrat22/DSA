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
		int [] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

		for(int i = 0; i<arr.length; i++){
			if(num  == arr[i]){
				return true;
			}
			if(num%arr[i] == 0){
				return false;
			}
		}
		return true;
		
	}

	public static boolean isDigitsUsed(boolean [] visited, int st, int en){
		for(int i = st; i < en; i++){
			if(visited[i] == true){
				return true;//  I have used the digits 
			}
		}
		return false; // I have bot used the digits
	}
    public static void solve(StringBuilder str,int n){
		boolean [] visited = new boolean[n];
		int count = 0;
        for(int i = 1; i<=n; i++){ // This loop will define kitne length ki substring ko dekhna hai 
			for(int st = 0; st <= n - i; st++){
				long num = Long.parseLong(str.substring(st, st + i));
				if(isAj(num) == true  && isDigitsUsed(visited, st, st + i) == false){
					count++;
					for(int k = st; k < (st + i); k++){
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(count);
    }
}