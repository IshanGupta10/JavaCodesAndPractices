
public class typeEmployees 
{
	int empID;
	String name;
	
	public typeEmployees()
	{
		super();
	}
	
	public typeEmployees(int empID, String name) 
	{
		super();
		this.empID = empID;
		this.name = name;
	}

	public void increment()
	{
		
	}
	
	@Override
	public String toString() 
	{
		return "typeEmployees [empID=" + empID + ", name=" + name + "]";
	}
}
