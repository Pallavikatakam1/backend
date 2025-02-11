import java.util.Scanner;
public class FibonnacciSequence {
	
	public static void main(String args[])   {  //main method
		

		Scanner scanner = new Scanner(System.in);  //creating the new scanner object
		System.out.print("Enter number: ");    //asks user to enter a number    
		int number=scanner.nextInt();  //reads the user input from scanner
		
		int num1 = 0 , num2 = 1;  //starts to verify the loop
		System.out.println("Fibonacci series for " +number+ " is:"); //prints the statement for the given number
		
		for (int sum=0; sum<=number ;  sum++)  //starts the iteration of the loop from zero to user given number
		{
			System.out.print(num1+" ");  //as the iteration starts from num1 so it prints num1 at first
		
		
		if (num1%3==0)   //while iterating the loop if the num1 is divisible by 3 then
		{
			System.out.println("I am spiderman"); //it prints the statement
		}
		else if (num1%5==0)        //if the num1 is divisible by 5 then
		{
			System.out.println("I am ironman");   //it prints the statement
		}
		else if (num1%3==0 && num1%5==0)    //if the num1 is divisible by both 3 and 5 then
		{
			System.out.println("I'm spiderman and ironman"); // it prints the statement
		}
		else   //if num1 is not divisible by any given statement then
		{
			System.out.println("I'm zero");     //it prints the statement
		}
		int next = num1+num2;   //to print the fibonacci series the rule is adding num1 and number2
		num1=num2;
		num2=next;    // the loop continues upto given user number
		}
	}
}
	