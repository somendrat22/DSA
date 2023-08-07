import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
		sc.close();
		// false : number is not prime 
		// true : number is prime 
		boolean flag = true; //  
		for(int i = 2; i*i<=n; i++){
			if(n%i == 0){
				flag = false; //
				break;
			}
		}
		if(flag == true){
			System.out.println(n + " is a prime number");
		}else{
			System.out.println(n + " is not a prime number");
		}
    }
}