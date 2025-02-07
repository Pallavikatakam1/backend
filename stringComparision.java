
public class stringComparision {

	public static void main(String[] args) {
		
String str1 = "Quest";
String str2 = "Quest";

System.out.println("with literals:");
System.out.println("str1==str2:" +(str1 == str2));
System.out.println("str1 equals to str2:" +str1.equals(str2));

String str3=new String("Tech");
String str4=new String("Tech");

System.out.println("with keywords");
System.out.println("str3==str4:" +(str3==str4));
System.out.println("str3 equals to str4:" +str3.equals(str4));
	}

}
