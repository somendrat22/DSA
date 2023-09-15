import java.util.*;
class Main{
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt(); // 2

		for(int t = 1; t <= tc; t++){

			// Asking input from usr 
			  int n = scn.nextInt(); // n = 9
			// Diamond Pattern 

				int space = n/2; // 2
				int star = 1; // 1
				for(int row  = 1; row <= n; row++){
					// Print outer spaces 
		
					// row -> 1
					for(int sp = 1; sp <= space; sp++){
						System.out.print("  "); 
					}
					// print star 
					for(int st = 1; st <= star; st++){
						System.out.print("* ");
					}
		
					// I have to set configuration of stars and spaces according to the next row 
					System.out.println();
					if(row <= n/2){
						space--;
						star +=2; 
					}else{
						space++;
						star -= 2;
					}
		
					
				}
		}
		


	}

}
