package com.sapient.salrycalculator.project;

import java.util.Scanner;

public class TestClassEmployee {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary ");
		int mothSal = sc.nextInt();
		System.out.println("Enter DOB ");
		String dob = sc.next();
		sc.close();
		
		EmployeeTaxCalculator EC = new EmployeeTaxCalculator(mothSal, dob);
		
		System.out.println(EC.taxCalculator());
		
	}

}
