import java.util.*;
class Main{
	

	// If a function is having a return type as int basically it is going to return a value wherever it got called 


  public static int sum(int a, int b){
	// This function returns integer kind of value. 
	
	return a + b;
  }

  // Give me 2 mins 

   public static void printName(){
	// Void functions are those functions which does not have any return type 
	Scanner scn = new Scanner(System.in);
	String name = scn.next();
	System.out.println(name);
   } 

   public static void printHii(){
	System.out.println("hii");
   }



	// Functions requires parameters -> 
	public static void add2Number(int a, int b){
		// Declaration 

		int sum = a + b;

		System.out.println(sum);


	} 
	public static void main(String[] args){
		// printName();
		// printHii();
		// printHii();
		// printHii();
		// printName();
		// printName();
		// add2Number(3, 4);
		// add2Number(5, 6);
		// add2Number(10, 10);
		// printName();
		int addition = sum(10, 15);
		System.out.println(addition);
	}

}
