package com.sapient.salrycalculator.project;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestClass 
{
	EmployeeTaxCalculator EC;
	
	@Test(expected = InvalidInputException.class)
	public void testForNegativeAge()
	{
		EC = new EmployeeTaxCalculator(20000, "2018-10-20");
		
		double expected = 2000.0, delta = 0.1, actual = EC.taxCalculator();
		
//		assertEquals(expected, actual,delta);
	}
	
	@Test(expected = InvalidInputException.class)
	public void testForNegativeSalaryAgeLessThan50()
	{
		EC = new EmployeeTaxCalculator(-10, "1992-10-20");
		
		double expected = 0.0, delta = 0.1, actual = EC.taxCalculator();
		
//		assertEquals(expected, actual,delta);
	}
	
	@Test
	public void testForSalaryBetween0And10000AgeLessThan50()
	{
		EC = new EmployeeTaxCalculator(10000, "1990-10-20");
		
		double expected = 0.0, delta = 0.1, actual = EC.taxCalculator();
		
		assertEquals(expected, actual,delta);
	}
	
	
	@Test
	public void testForSalaryBetween10001And50000AgeLessThan50()
	{
		EC = new EmployeeTaxCalculator(25000, "1990-10-20");
		
		double expected = 2500.0, delta = 0.1, actual = EC.taxCalculator();
		
		assertEquals(expected, actual,delta);
	}
	
	
	@Test
	public void testForSalaryBetween50001And100000AgeLessThan50()
	{
		EC = new EmployeeTaxCalculator(60000, "1990-10-20");
		
		double expected = 9000.0, delta = 0.1, actual = EC.taxCalculator();
		
		assertEquals(expected, actual,delta);
	}
	
	@Test
	public void testForSalaryGreaterThan100000AgeLessThan50()
	{
		EC = new EmployeeTaxCalculator(200000, "1990-10-20");
		
		double expected = 40000.0, delta = 0.1, actual = EC.taxCalculator();
		
		assertEquals(expected, actual,delta);
	}
	
	
	@Test(expected = InvalidInputException.class)
	public void testForNegativeSalaryAgeMoreThan50()
	{
		EC = new EmployeeTaxCalculator(-10, "1950-10-20");
		
		double expected = 0.0, delta = 0.1, actual = EC.taxCalculator();
		
//		assertEquals(expected, actual,delta);
	}
	
	@Test
	public void testForSalaryBetween0And10000AgeMoreThan50()
	{
		EC = new EmployeeTaxCalculator(10000, "1950-10-20");
		
		double expected = 0.0, delta = 0.1, actual = EC.taxCalculator();
		
		assertEquals(expected, actual,delta);
	}
	
	
	@Test
	public void testForSalaryBetween10001And50000AgeMoreThan50()
	{
		EC = new EmployeeTaxCalculator(25000, "1950-10-20");
		
		double expected = 2250.0, delta = 0.1, actual = EC.taxCalculator();
		
		assertEquals(expected, actual,delta);
	}
	
	
	@Test
	public void testForSalaryBetween50001And100000AgeMoreThan50()
	{
		EC = new EmployeeTaxCalculator(60000, "1950-10-20");
		
		double expected = 8100.0, delta = 0.1, actual = EC.taxCalculator();
		
		assertEquals(expected, actual,delta);
	}
	
	@Test
	public void testForSalaryGreaterThan100000AgeMoreThan50()
	{
		EC = new EmployeeTaxCalculator(200000, "1950-10-20");
		
		double expected = 36000.0, delta = 0.1, actual = EC.taxCalculator();
		
		assertEquals(expected, actual,delta);
	}
	
}
