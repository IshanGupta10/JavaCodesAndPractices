import java.util.*;

public class testClass 
{
	public static void main(String[] args) 
	{
		List<bank> Bank = new ArrayList<bank>();
		List<branch> Branch1 = new ArrayList<branch>();
		List<branch> Branch2 = new ArrayList<branch>();
		List<branch> Branch3 = new ArrayList<branch>();
		List<ATM> Atm1 = new ArrayList<ATM>();
		List<ATM> Atm2 = new ArrayList<ATM>();
		List<ATM> Atm3 = new ArrayList<ATM>();
		
		Bank.add(new bank("HDFC"));
		Bank.add(new bank("ICICI"));
		Bank.add(new bank("YES"));

		Branch1.add(new branch("Delhi", true));
		Branch1.add(new branch("Gurgaon", false));
		Branch1.add(new branch("Noida", false));
		
		Branch2.add(new branch("Gurgaon", true));
		Branch2.add(new branch("Delhi", false));
		Branch2.add(new branch("Noida", false));
		
		Branch3.add(new branch("Noida", true));
		Branch3.add(new branch("Gurgaon", false));
		Branch3.add(new branch("Delhi", false));
		
		Atm1.add(new ATM("Noida"));
		Atm1.add(new ATM("Delhi"));
		Atm1.add(new ATM("Gurgaon"));
		
		Atm2.add(new ATM("Noida"));
		Atm2.add(new ATM("Gurgaon"));
		Atm2.add(new ATM("Delhi"));
		
		Atm3.add(new ATM("Delhi"));
		Atm3.add(new ATM("Gurgaon"));
		Atm3.add(new ATM("Noida"));		

		
	}
}
