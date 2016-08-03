package CalculatoraPackage;


public class CalculatorBaseClass 
{
	double a, b;

	public CalculatorBaseClass(double a, double b) 
	{
		this.a = a;
		this.b = b;
	}
	
	public double addition()
	{
		return a + b;
	}
	
	public double subtraction()
	{
		return a - b;
	}
	
	public double multiplication()
	{
		return a * b;
	}
	
	public double division()
	{
		try
		{
			if(b == 0.0)
				throw new ArithmeticE();
			else
				return a / b;
		}
		catch(ArithmeticE Exp)
		{
			return 0.0;
		}
	}
	
}
