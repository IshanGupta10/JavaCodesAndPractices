package VehicleTester;

public class testClass 
{
	public static void main(String[] args) 
	{
		vehicleClass Car = new carClass("Sedan", 100.50);
		vehicleClass Plane = new planeClass("Boeing", 500.50);
		
		Car.startVehicle();
		Plane.startVehicle();
	}
}
