

//here the user gives i put temperature value in celsius we have to convert them to fahrenheit

import java.util.Scanner; //imports the scanner
public class Temparature {
	
	//taking a double values here then let celsius be C and Fahrenheit be F

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); //creating a new object

		double celsius = 36.0, fahrenheit = 0.0; //analyzing the value
		fahrenheit = (celsius * 1.8) + 32; //formula for conversion
		
	System.out.println(celsius + " degree celsius in fahrenheit is" + fahrenheit + "fahreinheit");// prints the output
			
	}

}
