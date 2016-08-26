package AssignmentUML;

import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FillInTheBlanksTest 
{
	QuizBaseClass FITB;
	File fileQ = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/Questions.txt");
	File fileA = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/AnswersFITB.txt");
	File fileUA = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/UserAnswersFITB.txt");
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
		FITB = new FillInTheBlanks(1, questions, answers);
		
		assertTrue(FITB.makeQuiz());
	}
	

	@Test
	public void testMakeQuizQANull() throws Exception
	{
		FITB = new FillInTheBlanks(1, null, null);
	}
	
	@Test
	public void testGetUserAnswers()  throws Exception
	{
		FITB = new FillInTheBlanks(1, questions, answers);
		
		assertTrue(FITB.getUserAnswers(userAnswers));
	}
	
	@Test
	public void testGetUserAnswersUserAnswersNull() throws Exception
	{
		FITB = new FillInTheBlanks(1, questions, answers);
	}

	@Test
	public void testModify() throws Exception
	{
		FITB = new FillInTheBlanks(1, questions, answers);
		
		List<String> vaList = new ArrayList<String>();
		vaList.add("GurgaonNCR");

		assertTrue(FITB.makeQuiz());
		assertTrue(FITB.modifyQuiz(4, vaList));
	}

	@Test
	public void testModifyModificationNull() throws Exception
	{
		FITB = new FillInTheBlanks(1, questions, answers);

		FITB.makeQuiz();
	}
	
	@Test
	public void testModifyWrongQuestionNumber() throws Exception
	{
		FITB = new FillInTheBlanks(1, questions, answers);

		List<String> vaList = new ArrayList<String>();
		vaList.add("GurgaonNCR");

		assertTrue(FITB.makeQuiz());
		assertFalse(FITB.modifyQuiz(10, vaList));
	}
	
	@Test
	public void testCalculateScore()  throws Exception
	{
		FITB = new FillInTheBlanks(1, questions, answers);
		assertTrue(FITB.makeQuiz());
		assertTrue(FITB.getUserAnswers(userAnswers));
		
		int actual = FITB.calculateScore(), expected = 3;
		
		assertEquals(expected, actual);
	}

	@Test(expected = Exception.class)
	public void testCalculateScoreQuizNull()  throws Exception
	{
		FITB = new FillInTheBlanks(1, null, answers);

		assertFalse(FITB.makeQuiz());
		assertTrue(FITB.getUserAnswers(userAnswers));
		
		int actual = FITB.calculateScore(), expected = 3;
		
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testViewQuiz()  throws Exception
	{
		FITB = new FillInTheBlanks(1, questions, answers);
		assertTrue(FITB.makeQuiz());
		assertTrue(FITB.getUserAnswers(userAnswers));
		
		assertTrue(FITB.viewQuiz());
	}

	@Test(expected = Exception.class) 
	public void testViewQuizNull()  throws Exception
	{
		FITB = new FillInTheBlanks(1, null, answers);

		FITB.makeQuiz();
		FITB.getUserAnswers(userAnswers);
		
		assertFalse(FITB.viewQuiz());

	}
	
	@Test
	public void testDeleteQuiz()  throws Exception
	{
		FITB = new FillInTheBlanks(1, questions, answers);
		FITB.makeQuiz();
		FITB.getUserAnswers(userAnswers);
		
		FITB.deleteQuiz();
	}
}
