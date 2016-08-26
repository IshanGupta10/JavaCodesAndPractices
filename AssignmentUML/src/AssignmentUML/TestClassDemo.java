package AssignmentUML;

import java.util.*;

public class TestClassDemo 
{
	public static void main(String[] args) 
	{
		int qCode = 10001;

		LinkedHashSet<String> Q = new LinkedHashSet<String>();
		List<List<String>> A = new ArrayList<List<String>>();
		
		Q.add("What is my name?");
		Q.add("What is my location?");
		Q.add("What is my job?");
		Q.add("What is my job location?");
		
		List<String> val1 = new ArrayList<String>();
		val1.add("Ishan");
		List<String> val2 = new ArrayList<String>();
		val2.add("Gurgaon");
		List<String> val3 = new ArrayList<String>();
		val3.add("Software Developer");
		List<String> val4 = new ArrayList<String>();
		val4.add("Gurgaon-SEZ");

		A.add(val1);
		A.add(val2);
		A.add(val3);
		A.add(val4);
		
		FillInTheBlanks FITB = new FillInTheBlanks(qCode, Q, A);
		
		try
		{
		if(FITB.makeQuiz())
			System.out.println("M.Success! \n");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		
		try
		{
		if(FITB.viewQuiz())
			System.out.println("V.Success! \n");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		List<String> val5 = new ArrayList<String>();
		val5.add("GurgaonNCR");
		
		try
		{	
		if(FITB.modifyQuiz(4, val5))
			System.out.println("Mo.Success! \n");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		
		try
		{
		if(FITB.viewQuiz())
			System.out.println("V.Success! \n");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		try
		{
		if(FITB.getUserAnswers(A))
			System.out.println("UA.Success! \n");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		
		int value;
		
		try
		{
			value = FITB.calculateScore();
			if(value != -1)
				System.out.println("Your score is: " + value + "\n");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		
		
		
		System.out.println("=====================================================");
		
		try
		{
		if(FITB.viewQuiz())
			System.out.println("Success! \n");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		A.clear();
		A.add(val1);
		A.add(null);
		A.add(val3);
		A.add(val5);
		
//		Collections.reverse(A);
		try
		{
		if(FITB.getUserAnswers(A))
			System.out.println("UA.Success! \n");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		
		
		try
		{
			value = FITB.calculateScore();
			if(value != -1)
				System.out.println("Your score is: " + value + "\n");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		
		
		FITB.deleteQuiz();
	}
}
