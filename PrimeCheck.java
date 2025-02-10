
//To check weather the given number id prime number or not by using recursion

import java.util.Scanner;  //import the scanner
public class PrimeCheck {
	public static boolean isPrime(int num) // starts to check the given is  prime or not
	{
		if (num<=1)  //condition to check the number
		{
			return false;
		}
	    for (int a=2; a<=Math.sqrt(num); a++)
	    {
	    	if (num%a==0)
	    	{
	    		return false;  //returns the value
	    	}
	    }
	    return true;
	}

	public static void main(String[] args) {
		int num = 10; // given number to check prime or not
		if (isPrime(num)) // if the given number was okay with the conditions it goes to print
		{
			System.out.println(num+"is prime"); //print the number if it was prime
			
		}
		else  //if given number  is not prime prints here
		{
			System.out.println(num + "is not prime"); //non prime number prints here
			
		}
	}

}
