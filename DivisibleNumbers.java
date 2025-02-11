import java.util.Scanner;

public class DivisibleNumbers {

		public static void main(String args[])   {  //main method
			

			Scanner scanner = new Scanner(System.in);  //creating the new scanner object
			System.out.print("Enter number: ");    //asks user to enter a number    
			int number=scanner.nextInt();  //reads the user input from scanner
			
			for(int divisor=1;divisor<=number;divisor++) //starts to verify the loop from 1 
			{
				if (divisor % 5==0)    // if the  number divided with 5
				{
					System.out.println("skip"); //should not have to be printed
					continue;   //loop stops and continue from next number
				}
				else if (divisor % 2==0)     //if number divided with 2
				{
					System.out.println(divisor + " is divisible by 2");    //should have to be printed with the statement
				}
				else if (divisor % 3==0)       // if number divided with 3
				{
					System.out.println(divisor + " is divisible by 3");  // printed with statement
				}
			}
	}

}
