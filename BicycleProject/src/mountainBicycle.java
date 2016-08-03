public class mountainBicycle extends bicycleBaseClass
{
	public mountainBicycle(double speed) 
	{
		this.speed = speed;
	}
	
	public void applyBrakes(double speed)
	{
		this.speed -= 2*speed;
	}
	
	public void speedUp(double speed)
	{
		this.speed += 2*speed;
	}

	@Override
	public String toString() 
	{
		return "MountainBicycle speed = " + speed + "";
	}
}
