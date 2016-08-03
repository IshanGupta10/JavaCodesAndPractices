
public class Employee 
{
	String name, address;
	int empID;
	float salary;
	
	
	public Employee(String name, String address, int empID, float salary) 
	{
		super();
		this.name = name;
		this.address = address;
		this.empID = empID;
		this.salary = salary;
	}
	
	public float incrementSalary(float x)
	{
		return this.salary += x;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", empID=" + empID + ", salary=" + salary + "]";
	}



	public static void main(String[] args) 
	{
		Employee A = new Employee("Ishan", "388, Sector 23.", 0001, 39459.36f);
		Employee B = new Employee("Gupta", "380, Sector 23.", 0002, 394502.01f);
		Employee temp = new Employee("","",0,0);
		
		temp = A;
		A = B;
		B = temp;
		System.out.println(A.name + " | " + A.address + " | " + A.empID + " | " + A.salary);
		
	}

}
