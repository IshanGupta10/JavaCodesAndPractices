
public class newEmployee 
{
	int empID;
	String name;
	String address;
	double salary;
	
	public newEmployee() 
	{
		super();
	}

	public newEmployee(int empID, String name, String address, double salary) 
	{
        super();
		this.empID = empID;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public void tell()
	{
		System.out.println("This is an Employee");
	}
	
	@Override
	public String toString() 
	{
		return "newEmployee [empID=" + empID + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
