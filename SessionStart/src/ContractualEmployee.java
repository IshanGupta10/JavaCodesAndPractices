
public class ContractualEmployee extends typeEmployees 
{
	double salaryPerHour;

	public ContractualEmployee(int id, String n, double salaryPerHour) 
	{
		this.empID = id;
		this.name = n;
		this.salaryPerHour = salaryPerHour;
	}
	
	public void increment()
	{
		this.salaryPerHour += 10.50;
	}

	@Override
	public String toString()
	{
		return "ContractualEmployee salaryPerHour=" + salaryPerHour + ", empID=" + empID + ", name=" + name + "]";
	}
}
