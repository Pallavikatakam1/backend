//To find the factorial of the given number by the user.



import java.util.Scanner; //import the scanner

public class Factorial {
	
	public static int factorial(int n) //start to calculate the factorial
	{
		int fact = 1; //variable value starts from 1
		for (int a=1; a<=n; a++) // calculates from 1 to given value
		{
			fact = fact * a; //gives the calculated factorial
		}
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in); //creating a new object
		System.out.println("Enter a number : "); //asks user to enter the number
		int n = scanner.nextInt(); //reads the user input
		int fact = factorial(n); // calculates the factorial
		System.out.println("Factorial of given number "+n+ "is:"+fact); //prints the output
		}

}
