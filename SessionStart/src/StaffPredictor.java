//Code to predict the Department based on choice
import java.util.Scanner;

public class StaffPredictor 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice - ");
		
		int choice = sc.nextInt();
		
		sc.close();
		
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
		
//		if(choice == 1)
//			System.out.println("You are in Networking.");
//		else if(choice == 2)
//			System.out.println("You are in  Accounts.");
//		else if(choice == 3)
//			System.out.println("You are in  Finance.");
//		else if(choice == 4)
//			System.out.println("You are in Marketing.");
//		else if(choice == 5)
//			System.out.println("You are in Technology.");
//		else
//			System.out.println("No Department Found!");
	}

}
