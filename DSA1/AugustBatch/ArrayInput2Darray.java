import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scn = new Scanner(System.in);
        
		int [][] arr = new int[3][3];

		for(int row = 0; row < 3; row++){
            int [] rowArr = arr[row];
			for(int i = 0; i < rowArr.length; i++){

                System.out.println("Enter the value for " + row + "th row and " + i  + "th column");

				rowArr[i]= scn.nextInt();
			}
		}
		

        for(int row = 0; row < 3; row++){
            for(int col  = 0; col < 3; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
	}
}
