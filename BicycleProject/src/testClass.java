public class testClass 
{

	public static void main(String[] args) 
	{
		roadBicycle rb[] = new roadBicycle[2];
		mountainBicycle mb[] = new mountainBicycle[2];
		
		rb[0] = new roadBicycle(10.75);
		rb[1] = new roadBicycle(40.75);
		
		mb[0] = new mountainBicycle(10.75);
		mb[1] = new mountainBicycle(40.75);
		
		for(roadBicycle B : rb)
			System.out.println(B);
		
		for(mountainBicycle B : mb)
			System.out.println(B);
		
		System.out.println("=============================");
		
		rb[0].applyBrakes(3.0);
		rb[1].speedUp(5);
		
		mb[1].applyBrakes(3.0);
		mb[0].speedUp(5);

		for(roadBicycle B : rb)
			System.out.println(B);
		
		for(mountainBicycle B : mb)
			System.out.println(B);
	}

}
