
public class EmployeeSalary 
{
	public static void main(String[] args)
	{
		Employee E[] = new Employee[3];
		
		E[0] = new Employee("Ishan", "123,asdd", 1, 100.01f);
		E[1] = new Employee("Varun", "321,asdd", 2, 200.36f);
		E[2] = new Employee("Vikas", "213,asdd", 3, 300.96f);
		
		for(Employee X : E)
			System.out.println(X + "\n");
		
		System.out.println("After Updating... \n");

		E[0].incrementSalary(1.2f);
	
		
		for(Employee X : E)
			X.salary *= X.salary;

		for(Employee X : E)
			System.out.println(X + "\n");
	}
}
