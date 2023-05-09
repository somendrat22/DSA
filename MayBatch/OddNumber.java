import java.util.*;
  
class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        int count = 0;
		while(true){
            int num = sc.nextInt();
            count++;
            if(num%2 != 0){
                break;
            }
        }
        System.out.println(count);
	}
}