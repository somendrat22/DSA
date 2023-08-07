import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) 
	{
		

		// %d -> Integer values,
		// %f -> FLoat or decimal values
		// %s -> string


		// +

		// / -> It will give you quotient

		// % -> It will give you remainder 


		// 5/2 -> 2.5 -> 2


		// From left to right : 
		// Brackets
		// Divison & Multiplication 
		// Addition & Subtraction have the same priority

		// 10 - 5/2
		// 10 - 2
		// 8 

		// Variables -> It is basically the containers which can store specific type of data 
		// DataTypes :


		// Primitive DataTypes 
		// int  -> It will store integer type of data it contains value from -10^9 to 10^9
		// long -> It also stores integer type of data  but it has bigger range example -10^18 to 10^18
		// float -> It will store decimal or floating point numbers & its precison is upto 4 decimal places -> 10.0000
		// double -> It also stores decimal or floating point numbers & its precison is more than float. 
		// char -> It stores a character eg : 'a', 'A', '%', 'd', '9', ' '
		// boolean -> This datatype basically contains true & false
		// byte -> It stores small integer values. This will accept integr values i.e from -128 to 127
		// short -> It also stres small ineteger values i.e -32768 to 32767

		// Non-Primitive DataTypes :
		// Arrays -> int [] 
		// String -> Sequence of character eg "Hii I am somendra"


		// Variables : It is something which can store a particular type of data,. 

		int a; // I have declared a integer type of variable whoose name is a. 
		a = 11; // I have initialized this a with some integer value.
		a = 5; // This is assignment by this we are assigning 5 into a & Single '=' is assignment operator
		float b = 15.65f;
		String str = "abc";
		//boolean x = ;
		//System.out.println(x);
		// Type Casting  : Its a process converting one datatype to another datatype

		// Explicit TypeCasting : Typecasting which we are doing on our own is explicit typecasting/
		// Implicit TypeCasting : Typecasting which is done by java is implicit typecasting 
	    a = (int) 10.11; // 10 // Explicit Type casting 
		double d = a; // a is a integer type of variable and we are trying to put integer type of value into double type of variable. 
		// Typecasting happened what type : Implicit typecasting happened java did it by itself. 
		// When Implicit type casting takes place ?
		// Whenever we are trying to assign values of small datatype to bigger datatype at that time automatically implicit type casting will take place 
		long z = a; // Typecasting took place. Implicit typecasting 
		// int y = z;

		String fName = "Somendra";
		String lName = "Tiwari";
		String fullName = fName +  " " + lName; // Adding strings is called concatenation

		System.out.println("Hii I am somendra" + 5 + 5); // Implicit type casting took place

		// "Hii I am somendra" + "5" + 5
		// "Hii I am somendra5" + "5" -> "Hii I am somendra55"


		final int n = 10;
		n = 20;
		System.out.println(5 + 5 + "Hii");

		// 5 + 5 + "hii"
		// 10 + "hii"
		// "10hii"

		// "Hii I am somendra" + "5" -> Hii I am somendra5 




		// Conditionals In Java 

		// if(condition){
		// 	// If your condtion got satisfied you will come inside this
		// }else{
		// 	// If condition got failed what ever code you have written in else block this will run.
		// }



	}
}