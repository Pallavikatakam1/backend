import java.util.Scanner;
public class PatternByNestedLoops {

	public static void main(String[] args)      
	{
		Scanner scanner = new Scanner(System.in);       //creating the new scanner object
		System.out.println("Entre the number : ");    //asks user to enter a number 
		int rows = scanner.nextInt();              //reads the user input from scanner
		
		for (int num1=1; num1<= rows; num1++)        //starts to verify the numbers of given range in the loop from num1=1
		{
			if (num1%2==0)           // if the number divided by 2
			{
				for (int num2=0; num2<num1 ; num2++)    //if the loop gives even number
				{
					System.out.print(num1);        //prints number
				}
			}
			else       //if the loop doesn't iterate
			{
				for(int num2=0; num2<num1; num2++)  //means odd number came from loop
				{
				System.out.print("*");	//prints '*'
				}
			}
			System.out.println( ); //prints the sequence
		}
}
}
