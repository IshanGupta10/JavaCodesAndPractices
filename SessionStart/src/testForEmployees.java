
public class testForEmployees
{
	public static void main(String[] args) 
	{
		
		typeEmployees tp1 = new RegularEmployee(1, "Ishan", 123.321);
		typeEmployees tp2 = new RegularEmployee(2, "Gupta", 321.123);
		typeEmployees tp3 = new ContractualEmployee(1, "Jatin", 456.654);
		typeEmployees tp4 = new ContractualEmployee(2, "Gupta", 654.456);
		
		typeEmployees emp[] = {tp1, tp2, tp3, tp4};

		for(typeEmployees E: emp)
			System.out.println(E);
		
		System.out.println("================================================");
		
		for(typeEmployees E: emp)
			E.increment();
		
		for(typeEmployees E: emp)
			System.out.println(E);
	}
}
