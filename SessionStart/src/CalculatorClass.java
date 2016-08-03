	//Code for operating on two variables.
	
	import java.util.*;
	
	public class CalculatorClass 
	{
		
		public static int addition(int x, int y)
		{
			return x + y;
		}
		
		public static int subtraction(int x, int y)
		{
			return x - y;
		}
		
		public static long multiplication(int x, int y)
		{
			return x * y;
		}
		
		public static double division(int x, int y)
		{
			return x / y;
		}
		
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
	
			System.out.println("New Calaculator! \n 1. Addition \n "
										+ "2. Subtraction " + "\n "
											+ "3. Multiplication \n "
												+ "4. Division \n");
			
			System.out.println("Enter your choice, first number,"
										+ " second number - ");
			
			int choice = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
			
			sc.close();
			
			if(choice == 1)
				System.out.println("Addition = " + addition(x, y));
			else if(choice == 2)
				System.out.println("Subtraction = " + subtraction(x, y));
			else if(choice == 3)
				System.out.println("Multiplication = " + multiplication(x, y));
			else if(choice == 4)
				if(y == 0)
					System.out.println("Not Possible");
				else
					System.out.println("Division = " + division(x, y));
			else
				System.out.println("Incorrect choice input. Please check!");
		}
	}
