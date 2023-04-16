import java.util.*;

public class Main {
static boolean checkPrime(long n){
	for(int i = 2; i*i<=n; i++){
		if(n%i == 0){
			return false;
		}
	}
	return true;
}
static long maxPrimeFactors(long n) {
	int ans = 1;
    for(int i = 2; i<=n; i++){
		if((n%i) ==  0 && checkPrime(i)){
			ans = Math.max(ans, i);
		}
	}
	return ans;
}

  // Driver code
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();
    System.out.println(maxPrimeFactors(n));
  }
}