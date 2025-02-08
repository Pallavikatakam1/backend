import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("enter start number"); // taking  start input range from the  user
		int start = console.nextInt();
		System.out.println("enter end number"); // taking end input range from the user
		int end = console.nextInt();
		
		System.out.println("prime num between " + start+ " and" +end +":"  );
		
		for (int num = start; num <= end; num++)
		{
		if (isPrime(num))
		{
			System.out.println(num +" ");
		}			
	}
}
	public static boolean isPrime(int num)
	{
		if (num<=1)
		{
			return false;
		}
		for (int i=2; i*i <=num; i++) //checking the number is divisible by 2 or not
		{
			if (num% i ==0) //divisor must between 1 and -1
			{
				return false;
			}
		}
		return true;
	}
}