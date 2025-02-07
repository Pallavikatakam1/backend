
import java.util.Scanner;

	public class BasicString {
		
	public static void main(String[] args) {
		
		
		Scanner scanner =  new Scanner(System.in);
		
		/*string input*/
		System.out.println("Enter a string:");
		String inputString = scanner.nextLine();
		
		/*upper case and lower case*/
		String upperCaseString = inputString.toUpperCase();
		System.out.println("UpperCase:" + upperCaseString); 
		String lowerCaseString = inputString.toLowerCase();
		System.out.println("LowerCase:" + lowerCaseString);
				
        /*length of string*/
		System.out.println("The length of the txt string is: " +inputString.length());
	
		/*replacement of char*/
		System.out.println("value replaced :" +inputString.replace("a","@pall"));
		
	
	}

}
