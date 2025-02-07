import java.util.Scanner;

public class stringBuffer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String stringBuffer=sc.nextLine();
		
		StringBuffer sb1=new StringBuffer("Nice");
		System.out.println("Before appending :"+sb1);
		sb1.append("Work");
		sb1.append("Employee");
		System.out.println("After appending :"+sb1);
		sb1.insert(6,"Thankyou ");
		System.out.println("After inserting at 6 index :"+sb1);
		System.out.println("\n");
		
		
	}
}
