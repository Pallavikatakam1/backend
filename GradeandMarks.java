import java.util.Scanner;

public class GradeandMarks {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  //creating the new scanner object
		System.out.print("Enter the marks ");    //asks user to enter a number    
		int marks=scanner.nextInt();  //reads the user input from scanner
		if(marks<0 || marks>100)  //user given marks should be between 0 and 100
		{
			System.out.println("Invalid "); //otherwise gives invalid
		}
		else  // if gives between 0 and 100 loop starts to execute
		{
			switch(marks/10) {
			case 10:
			case 9:   //from 90 to 100 Grade A is printed
				System.out.println("Grade A");
				break;
			case 8:   //from 80 to 89 Grade A is printed
				System.out.println("Grade B");
				break;
			case 7:    //from 70 to 79 Grade A is printed
				System.out.println("Grade C");
				break;
			case 6:     //from 60 to 69 Grade A is printed
				System.out.println("Grade D");
				break;
			case 5: case 4: case 3:case 2: case 1: case 0:  //from 0 to 59 Grade A is printed
				System.out.println("Grade F");
				break;
			}
		}

	}

}
