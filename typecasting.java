import java.util.Scanner;
public class typeCasting {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String : ");
		String typeCasting=scanner.nextLine();
		
		int value1 = 2;
		double value2 = value1;
		System.out.println("int to double is: "+value2);
		double value3 = 3.2;
		int value4 =  (int) value3;
		System.out.println("double to int : "+value4);
		char surname = 'P';
		int toInt= (int) surname;
		System.out.println("char to int : "+toInt);
		int number = 66;
		char toChar= (char) number;
		System.out.println("int to char : "+toChar);
		System.out.println("\n");
		
	}		
	
}
