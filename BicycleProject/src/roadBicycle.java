public class roadBicycle extends bicycleBaseClass
{
	public roadBicycle(double speed) 
	{
		this.speed = speed;
	}
	
	public void applyBrakes(double speed)
	{
		this.speed -= speed;
	}
	
	public void speedUp(double speed)
	{
		this.speed += speed;
	}

	@Override
	public String toString() 
	{
		return "RoadBicycle speed = " + speed + "";
	}
}
