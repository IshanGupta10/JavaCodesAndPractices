
public class Manager extends newEmployee
{
	public Manager() 
	{
        super.tell();
	}
    
    public Manager(int a, String b, String c, double d)
    {
        this.empID = a;
        this.name = b;
        this.address = c;
        this.salary = d;
    }
	
	public void tell()
	{
		System.out.println("This is a Manager.");
	}
}

class testmain
{
    public static void increment(newEmployee e)
    {
        e.salary *= 2.5;
    }
    
	public static void main(String args[])
	{
        Manager k = new Manager();
		newEmployee m = new Manager(1, "Ishan", "388, Sector 23", 23.45);
		m.tell();
        increment(m);
        System.out.println(m.salary);
	}
}