
public class wrapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer ff = 1;
		
		
		int primitiveInt = 100;
		Integer wrappedInt = primitiveInt;
		System.out.println("autoboxing:" +wrappedInt);
		
		
		Integer wrappedInt2 = 200;
		int primitiveInt2 = wrappedInt2;
		System.out.println("unboxing:" +primitiveInt2);
		
		String strNumber = "222";
		int parseInt = Integer.parseInt(strNumber);
		System.out.println("string to integer:" +parseInt);
		
		Integer num = 333;
		String strValue = num.toString();
		System.out.println("integer to string:"+strValue);
		
		
	}

}
