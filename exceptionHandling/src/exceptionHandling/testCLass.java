package exceptionHandling;

public class testCLass 
{

	public static void main(String[] args) 
	{
		employeeBase B = new employeeBase("Ishan", 10, 123.321);
		employeeBase B2 = new employeeBase("Ishan", 10, -123.321);		

		System.out.println(B);
		System.out.println(B2);
		
	}

}
