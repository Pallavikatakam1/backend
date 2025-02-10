
// To sum the digits in the given number by the userr.


import java.util.Scanner; //import new scanner object
public class SumOfDigits {

	public static void main(String[] args) { //main method
		
		int number,lastdigit,sum = 0; //operators used
		Scanner scanner = new Scanner(System.in); // creating a new object
		System.out.println("Enter the number: "); // asks user to enter a number
		number = scanner.nextInt(); //creates the output
		while (number>0)  // condition to verify the given number
		{
			lastdigit = number%10; //last digit of the given input was divided with 10
			
			sum = sum+lastdigit;  //add the last digit with the remaining
			
			number = number/10; // remove the last digit
		}
			
		System.out.println("Sum of the Digits of the  given number :" +sum);
		
	}

}
