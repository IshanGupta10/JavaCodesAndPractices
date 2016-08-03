package VehicleTester;

public class carClass extends vehicleClass
{
	String make;
	
	public carClass(String make, double maxspeed) 
	{
		this.make = make;
		this.maxSpeed = maxspeed;
	}

	public void startVehicle()
	{
		Engine E = new Engine();
		E.startEngine(true, make);

		System.out.println("Starting the "+ make + "...");
		System.out.println(E);
	}
}
