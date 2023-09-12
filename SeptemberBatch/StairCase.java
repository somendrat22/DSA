import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
		int spaceCount = n - 1; // Initialy We are going to set spaceCount according to 1st Row
		int hashCount = 1; 

		// Outer loop -> It will visit every row 
		for(int row = 1; row <= n; row++){
			// row -> 1
			// First work is to print spaces according to pattern 

			// When we will enter the outer loop we are going to the printing for the particular row \

			for(int col = 1; col <= n; col++){
				if(col <= spaceCount){
					// print spaces 
				}else{
					// print hash 
				}
			}
			// enterc 
			// for(int sp = 1; sp <= spaceCount; sp++){
			// 	System.out.print(" ");
			// }
			// // second work is to print hash
			// for(int h = 1; h <= hashCount; h++){
			// 	System.out.print("#");
			// }

			// spaceCount--; // 
			// hashCount++;
			
			// System.out.println();
		}
		
    }
}


