import java.util.Scanner;  
public class multiplicationtable 
{  
public static void main(String args[])   
{  
Scanner scanner = new Scanner(System.in);  
System.out.print("Enter number: ");    //asks user to enter a number   
  
int num=scanner.nextInt();  

for(int i=1; i <= 10; i++)//apply the condition  
{  

System.out.println(num+" * "+i+" = "+num*i);// prints the table 
}  
}  
}  