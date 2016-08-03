package VehicleTester;

public class planeClass extends vehicleClass
{
	String make;
	
	public planeClass(String make, double maxspeed) 
	{
		this.make = make;
		this.maxSpeed = maxspeed;
	}

	public void startVehicle()
	{
		Engine E = new Engine();
		E.startEngine(true, true, make);
		
		System.out.println("Starting the "+ make + "...");
		System.out.println(E);
	}
}
