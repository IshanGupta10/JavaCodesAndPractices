import java.util.*;

public class testList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> friends = new ArrayList<String>();
		
		friends.add("Ishan");
		friends.add("Harsh");
		friends.add("Jai");
		friends.add("Ayush");
		
		if(friends.contains("Ishan"))
			System.out.println("Yes");
		
		List<fruit> FruitList = new ArrayList<fruit>();
		
		FruitList.add(new fruit("Apple"));
		FruitList.add(new fruit("Orange"));
		FruitList.add(new fruit("Grapes"));

		
		Collections.sort(FruitList);
		
		System.out.println(FruitList);
		
		if(FruitList.contains(new fruit("Apple")))
			System.out.println("Hell, Yes~!");
	}
}
