import java.util.Scanner;

public class evenNum {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("enter start number");
		int start = console.nextInt();
		System.out.println("enter end number");
		int end = console.nextInt();
		
		
		int sum=0;
		System.out.println("the even numbers between "+start+ "and"+end+ "are the following");
		for(int r = start; r<=end; r++)
		{
			if(r%2==0)		
			{
		sum += r;
		System.out.println(r);		
			}
		}
     System.out.println("the sum of even numbers between:"+start+"and"+end+"is:" +sum);
}
		
}