
public class RegularEmployee extends typeEmployees
{
	double monthlysalary;

	public RegularEmployee(int id, String n, double monthlysalary) 
	{
		this.empID = id;
		this.name = n;
		this.monthlysalary = monthlysalary;
	}
	
	public void increment()
	{
		this.monthlysalary+=2500.50;
	}

	@Override
	public String toString()
	{
		return "RegularEmployee monthlysalary=" + monthlysalary + ", empID=" + empID + ", name=" + name + "]";
	}
}
