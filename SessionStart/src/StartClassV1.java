//Code for swapping for two variables.
import java.util.*;

public class StartClassV1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt() , temp = 0;

		sc.close();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = "+ a +" and b = " + b);
	}

}
