package exceptionHandling;
//import java.lang.*;

class exce extends Exception
{
	public void excpe()
	{
		System.out.println("Salary should be greater than zero");
	}
}

public class employeeBase 
{
	String name;
	int id;
	double salary;
	
	public employeeBase(String name, int id, double d) 
	{
		try
		{
			this.name = name;
			this.id = id;
			if(d > 0)
				this.salary = d;
			else
				throw new exce();
		}
		catch(exce e)
		{
			e.excpe();
		}
	}

	@Override
	public String toString() 
	{
		return "EmployeeBase Name = " + name + ", id = " + id + ", salary = " + salary;
	}
	
	
}
