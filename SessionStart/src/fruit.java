public class fruit implements Comparable
{
	String name;

	public fruit()
	{
		
	}
	
	public fruit(String name)
	{
		this.name = name;
	}
	
    @Override
	public String toString() 
	{
		return name;
	}

	@Override
    public int compareTo(Object o1) 
    {
    	fruit o2 = (fruit) o1;
        return this.name.compareTo(o2.name);
    }
}