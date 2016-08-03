public class ATM 
{
	String location;

	public ATM(String location)
	{
		this.location = location;
	}

	@Override
	public String toString() 
	{
		return "ATM " + location;
	}
	
}
