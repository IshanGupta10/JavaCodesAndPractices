package CalculatoraPackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorBaseClassTest 
{
	@Test
	public void addTwoNumbers() 
	{
		CalculatorBaseClass calculate = new CalculatorBaseClass(2.5, 1.5);
		
		double addResult = calculate.addition(), expectedAdd = 4.0;
		assertEquals(expectedAdd, addResult, 0.1);
	}
	
	@Test
	public void subtractTwoNumbers()
	{
		CalculatorBaseClass calculate = new CalculatorBaseClass(2.5, 1.5);
		
		double subResult = calculate.subtraction(), expectedSub = 1.0;
		assertEquals(expectedSub, subResult, 0.1);
	}
	
	@Test
	public void multiplyTwoNumbers()
	{
		CalculatorBaseClass calculate = new CalculatorBaseClass(2.5, 1.5);
		
		double mulResult = calculate.multiplication(), expectedMul = 3.8;
		assertEquals(expectedMul, mulResult, 0.1);
	}
	
	@Test
	public void divideTwoNumbers()
	{
		CalculatorBaseClass calculate = new CalculatorBaseClass(2.5, 1.5);
		
		double divResult = calculate.division(), expectedDiv = 1.7;
		assertEquals(expectedDiv, divResult, 0.1);
	}
	
	@Test(expected = ArithmeticE.class)
	public void divTwoNumbers()
	{
		CalculatorBaseClass calculate = new CalculatorBaseClass(2.5, 0.0);
		
		double divResult = calculate.division(), expectedDiv = 1.7;
	}
}
