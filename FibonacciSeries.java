
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 10;
		int firstNumber = 0, secondNumber = 1;
		
		
		System.out.println("Fibobnacci series is:"  +n);
		
		for (int i=1; i<=n; ++i)
		{
			System.out.println(firstNumber + " ");
			
		    int nextNumber = firstNumber+secondNumber;
		    firstNumber = secondNumber;
		    secondNumber = nextNumber;
		    	
		}
		
	}

}
