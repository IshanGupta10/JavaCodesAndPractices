//Not working, dunno why?
public class StaffPredictorSystemArugments 
{
	public static void main(String[] args) 
	{
		int choice;
		if(!args[0].equals(null))
			choice = 3;
		else
			choice = Integer.parseInt(args[0]);
		
		switch(choice)
		{
		case 1: System.out.println("You are in Networking.");
				break;
		case 2: System.out.println("You are in Accounts.");
				break;
		case 3: System.out.println("You are in Finance.");
				break;
		case 4: System.out.println("You are in Marketing.");
				break;
		case 5: System.out.println("You are in Technology.");
				break;
		default : System.out.println("No Department Found!");
		}
	}
}
