
//The multiplication table is printed 
//Here if the product exceeds 50 then the loop breaks
//If the product is multiple of 3 it does not print

import java.util.Scanner;  
public class multiplicationtable { 
	
public static void main(String args[])   {  //main method
	

Scanner scanner = new Scanner(System.in);  //creating the new scanner object
System.out.print("Enter number: ");    //asks user to enter a number    
int num=scanner.nextInt();  //reads the user input from scanner

for(int multiple=1; multiple <= 10; multiple++)  //apply the condition
{
  int product = num*multiple;  
  if (product>50)  // if the product is greater than 50 
  {
	  break;      // the loop breaks
  }
   if (product %3 ==0)   // if the product is multiple of 3
{
	continue;     // the loop continue from next line
}
    System.out.println(num + "x" + multiple + "=" + product); // prints the table
}
}
}
