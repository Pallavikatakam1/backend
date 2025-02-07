import java.util.Scanner;
public class stringBuilder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String string1=sc.nextLine();
	
		System.out.println("Enter string to check palindrome : ");
		String stringBuilder=sc.nextLine();
		StringBuilder sb=new StringBuilder(stringBuilder);
		String reverse=sb.reverse().toString();
		System.out.println("Reversed String : "+reverse);
		if(stringBuilder.equalsIgnoreCase(reverse)) {
			System.out.println("It's Palindrome");
		}
		else {
			System.out.println("It's not Palindrome");
		}
		System.out.println("\n");
	}

}
