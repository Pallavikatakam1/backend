
//here we have to print a java program to find the prime numbers in the given range
//below 10 numbers should be printed as small numbers and between 10 to 50 numbers are printed as medium and above 50 should be printed as large numbers
//switch case was used

import java.util.Scanner;

public class PrimeNumber {
	
	//method 1
	public static boolean isPrime(int num) // public class was taken as integer
	{
		if (num <= 1) // number is less than or equal to 1 then
		{
			return false; // false was returned
		}
		for (int prime = 2; prime * prime <= num; prime++) // checking the number is divisible by 2 or not
		{
			if (num % prime == 0) // divisor must between 1 and -1 then
			{
				return false; // false was returned
			}
		}
		return true; // Returns true if above was not implemented
	}
	
	
	//method 2
	public static void classifyNumber(int num) {
		switch (num) {    // switch case
		case 1:
			System.out.println(num + "is small");  
			break;
		default:
		}

		if (num < 10)     // number value less than 10
		{      
		System.out.println(num + "is small"); // printed as small value
		} 
		else if (num >= 10 && num <= 50) // number value greater than 10 and less than 50 then
		{
		System.out.println(num + "is medium"); // printed as medium
		}
		else if (num > 50)  //number greater than 50 then
		{
		System.out.println(num + "is large");  //print as  large
		}
	}

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);   //creating new scanner object
		System.out.println("enter start number"); // taking start input range from the user
		int start = console.nextInt();       //gives the input start value to the scanner object
		System.out.println("enter end number"); // taking end input range from the user
		int end = console.nextInt();      //gives the input end value to the scanner

		System.out.println("prime num between " + start + " and" + end + ":");  //prints the  return value from the method 1

		for (int num = start; num <= end; num++)  //starts to verify the numbers of given range in the loop
		{
			if (isPrime(num))        //finds the prime number in the given range
			{
				System.out.println(num + " ");  // prints the list of the prime numbers in the given range
			}
		}
	}
}
