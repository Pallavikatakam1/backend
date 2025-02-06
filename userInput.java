package com.questk2.test;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		Scanner aobj = new Scanner(System.in);
		boolean  isAnEmployee= true;
	    boolean isNotAnEmployee = false;    
	    System.out.println(isAnEmployee);
	    System.out.println(isNotAnEmployee);

		System.out.println("Enter name,age,working hours, salary, tax, savings, wastage:");
		
		String name = aobj.nextLine();
		
		int age =aobj.nextInt();
		
		short workingHours = aobj.nextShort();
		
		long salaryPerYear = aobj.nextLong();
		
		double tax = aobj.nextDouble();
		
		float savings = aobj.nextFloat();
		
		byte wastage = aobj.nextByte();
		
		System.out.println("Name: " + name); 
		
		System.out.println("Age: " + age); 
		
		System.out.println("Working Hours " + workingHours);
		
		System.out.println("Salary per Year: " + salaryPerYear); 
	
		System.out.println("Tax:pa" + tax); 
	
		System.out.println("Savings: " + savings);
		
		System.out.println("Wastage:" + wastage); 
		
	}

}
