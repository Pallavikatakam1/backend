
//To calculate the fibonacci series for the given number by using recursion


public class FibonacciRecursion {
	
	public static int fib(int num)
	{
		if(num<=1)    // verifies the given number is  greater than 1 or not
			return num;
		return fib (num-1)+fib (num-2); //calculate the Fibonacci series for given number
	}

	public static void main(String[] args) { //main method
		int num = 12; //given value
		for (int a=0 ; a<num ; a++) //calculate from 1
		{
			System.out.println(fib(a)+ " "); //prints the fibonacci series for given number
		}
	}

}
