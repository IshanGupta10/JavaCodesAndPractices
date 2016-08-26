package AssignmentUML;

import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NumericApproximationTest 
{
	QuizBaseClass NA;
	File fileQ = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/Questions.txt");
	File fileA = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/AnswersNA.txt");
	File fileUA = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/UserAnswersNA.txt");
	LinkedHashSet<String> questions = new LinkedHashSet<String>();
	List<List<String>> answers = new ArrayList<List<String>>();
	List<List<String>> userAnswers = new ArrayList<List<String>>();
	
	@Before
	public void getQuizData()
	{
		try 
		{
	        Scanner sc = new Scanner(fileQ);

	        while (sc.hasNextLine()) 
	        {
	            questions.add(sc.nextLine());
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) 
		{
	        e.printStackTrace();
	    }
		
		try 
		{
	        Scanner sc = new Scanner(fileA);

	        while (sc.hasNextLine()) 
	        {
	        	List<String> vaList = new ArrayList<String>();
	        	vaList.add(sc.nextLine());
	            answers.add(vaList);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) 
		{
	        e.printStackTrace();
	    }
		
		try 
		{
	        Scanner sc = new Scanner(fileUA);

	        while (sc.hasNextLine()) 
	        {
	        	List<String> vaList = new ArrayList<String>();
	        	vaList.add(sc.nextLine());
	            userAnswers.add(vaList);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) 
		{
	        e.printStackTrace();
	    }
	}
	
	@Test
	public void testMakeQuiz() throws Exception
	{
		NA = new NumericApproximation(1, questions, answers);
		
		assertTrue(NA.makeQuiz());
	}
	

	@Test
	public void testMakeQuizQANull() throws Exception
	{
		NA = new NumericApproximation(1, null, null);
	}
	
	@Test
	public void testGetUserAnswers()  throws Exception
	{
		NA = new NumericApproximation(1, questions, answers);
		
		assertTrue(NA.getUserAnswers(userAnswers));
	}
	
	@Test
	public void testGetUserAnswersUserAnswersNull() throws Exception
	{
		NA = new NumericApproximation(1, questions, answers);
	}

	@Test
	public void testModify() throws Exception
	{
		NA = new NumericApproximation(1, questions, answers);
		
		List<String> vaList = new ArrayList<String>();
		vaList.add("GurgaonNCR");

		assertTrue(NA.makeQuiz());
		assertTrue(NA.modifyQuiz(4, vaList));
	}

	@Test
	public void testModifyModificationNull() throws Exception
	{
		NA = new NumericApproximation(1, questions, answers);

		NA.makeQuiz();
	}
	
	@Test
	public void testModifyWrongQuestionNumber() throws Exception
	{
		NA = new NumericApproximation(1, questions, answers);

		List<String> vaList = new ArrayList<String>();
		vaList.add("GurgaonNCR");

		assertTrue(NA.makeQuiz());
		assertFalse(NA.modifyQuiz(10, vaList));
	}
	
	@Test
	public void testCalculateScore()  throws Exception
	{
		NA = new NumericApproximation(1, questions, answers);
		assertTrue(NA.makeQuiz());
		assertTrue(NA.getUserAnswers(userAnswers));
		
		int actual = NA.calculateScore(), expected = 3;
		
		assertEquals(expected, actual);
	}

	@Test(expected = Exception.class)
	public void testCalculateScoreQuizNull()  throws Exception
	{
		NA = new NumericApproximation(1, null, answers);

		NA.makeQuiz();
		NA.getUserAnswers(userAnswers);
		
	}
	
	@Test
	public void testViewQuiz()  throws Exception
	{
		NA = new NumericApproximation(1, questions, answers);
		assertTrue(NA.makeQuiz());
		assertTrue(NA.getUserAnswers(userAnswers));
		
		assertTrue(NA.viewQuiz());
	}

	@Test(expected = Exception.class)
	public void testViewQuizNull()  throws Exception
	{
		NA = new NumericApproximation(1, null, answers);

		NA.makeQuiz();
		NA.getUserAnswers(userAnswers);

	}
	
	@Test
	public void testDeleteQuiz()  throws Exception
	{
		NA = new NumericApproximation(1, questions, answers);
		NA.makeQuiz();
		NA.getUserAnswers(userAnswers);
		
		NA.deleteQuiz();
	}
}
