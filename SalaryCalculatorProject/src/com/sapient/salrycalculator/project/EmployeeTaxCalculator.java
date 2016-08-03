package com.sapient.salrycalculator.project;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeTaxCalculator 
{
	double tax, monthSalary;
	int monthlySalary, ageOfEmployee;
	String dateOfBirth;
	int a[] = new int[3];
	
	public EmployeeTaxCalculator(int monthlySalary, String dateOfBirth) 
	{
		this.monthlySalary = monthlySalary;
		this.dateOfBirth = dateOfBirth;
	}

	protected void calculateDate ()
	{
		String[] tokenvals = dateOfBirth.split("-");
		a[0] = Integer.parseInt(tokenvals[0]);
		a[1] = Integer.parseInt(tokenvals[1]);
		a[2] = Integer.parseInt(tokenvals[2]);
	}
	
	public double taxCalculator() 
	{
		calculateDate();
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(a[0], a[1], a[2]);
		Period age = Period.between(birthday, today);
		ageOfEmployee = age.getYears();
		
		
		try
		{
			if(ageOfEmployee < 0)
				throw new InvalidInputException();
			else if(ageOfEmployee >= 0 && ageOfEmployee < 50)
			{
				if(monthlySalary < 0)
					throw new InvalidInputException();
				else if(monthlySalary >= 0 && monthlySalary <= 10000)
					return 0.0;
				else if(monthlySalary > 10000 && monthlySalary <= 50000)
				{
					monthSalary = (double) monthlySalary;
	
					tax = 0.1 * monthSalary;
				}
				else if(monthlySalary > 50000 && monthlySalary <= 100000)
				{
					monthSalary = (double) monthlySalary;
					
					tax = 0.15 * monthSalary;
				}
				else
				{
						monthSalary = (double) monthlySalary;
				
						tax = 0.2 * monthSalary;
				}
			}
			else if(ageOfEmployee >= 50 && ageOfEmployee > 0)
			{
				monthlySalary -= (0.1 * monthlySalary); 
				
				if(monthlySalary < 0)
					throw new InvalidInputException();
				else if(monthlySalary >= 0 && monthlySalary <= 10000)
					return 0.0;
				else if(monthlySalary > 10000 && monthlySalary <= 50000)
				{
					monthSalary = (double) monthlySalary;
	
					tax = 0.1 * monthSalary;
				}
				else if(monthlySalary > 50000 && monthlySalary <= 100000)
				{
					monthSalary = (double) monthlySalary;
					
					tax = 0.15 * monthSalary;
				}
				else
				{
						monthSalary = (double) monthlySalary;
				
						tax = 0.2 * monthSalary;
				}
			}
		}
		catch(InvalidInputException E)
		{
			tax = 0.0;
		}
		return tax;
	}
	
}
