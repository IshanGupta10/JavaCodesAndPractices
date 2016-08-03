package VehicleTester;

public class Engine 
{
	boolean engine = false, booster = false;
	String make;

	public Engine()
	{
		
	}
	
	public void startEngine(boolean engine, String make) 
	{
		this.engine = engine;
		this.make = make;
	}

	public void startEngine(boolean engine, boolean booster, String make) 
	{
		this.engine = engine;
		this.booster = booster;
		this.make = make;
	}

	@Override
	public String toString() 
	{
		return "Engine = " + engine + ", Booster = " + booster + ", Make = " + make;
	}
	
	
}
