public class branch 
{
	String name;
	boolean isMain;
	
	public branch(String name, boolean value) 
	{
		this.name = name;
		this.isMain = value;
	}
	
	public boolean ismain()
	{
		return this.isMain;
	}

	@Override
	public String toString()
	{
		return "Branch " + name;
	}
}
