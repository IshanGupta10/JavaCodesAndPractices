package AssignmentUML;

import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class JumbledQuizTest 
{
	QuizBaseClass JQ;
	File fileQ = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/Questions.txt");
	File fileA = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/AnswersJQ.txt");
	File fileUA = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/UserAnswersJQ.txt");
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
		JQ = new JumbledQuiz(1, questions, answers);
		
		assertTrue(JQ.makeQuiz());
	}
	

	@Test
	public void testMakeQuizQANull() throws Exception
	{
		JQ = new JumbledQuiz(1, null, null);
	}
	
	@Test
	public void testGetUserAnswers()  throws Exception
	{
		JQ = new JumbledQuiz(1, questions, answers);
		
		assertTrue(JQ.getUserAnswers(userAnswers));
	}
	
	@Test
	public void testGetUserAnswersUserAnswersNull() throws Exception
	{
		JQ = new JumbledQuiz(1, questions, answers);
	}

	@Test
	public void testModify() throws Exception
	{
		JQ = new JumbledQuiz(1, questions, answers);
		
		List<String> vaList = new ArrayList<String>();
		vaList.add("GurgaonNCR");

		assertTrue(JQ.makeQuiz());
		assertTrue(JQ.modifyQuiz(4, vaList));
	}

	@Test
	public void testModifyModificationNull() throws Exception
	{
		JQ = new JumbledQuiz(1, questions, answers);

		JQ.makeQuiz();
	}
	
	@Test
	public void testModifyWrongQuestionNumber() throws Exception
	{
		JQ = new JumbledQuiz(1, questions, answers);

		List<String> vaList = new ArrayList<String>();
		vaList.add("GurgaonNCR");

		assertTrue(JQ.makeQuiz());
		assertFalse(JQ.modifyQuiz(10, vaList));
	}
	
	@Test
	public void testCalculateScore()  throws Exception
	{
		JQ = new JumbledQuiz(1, questions, answers);
		assertTrue(JQ.makeQuiz());
		assertTrue(JQ.getUserAnswers(userAnswers));
		
		int actual = JQ.calculateScore(), expected = 3;
		
		assertEquals(expected, actual);
	}

	@Test(expected = Exception.class)
	public void testCalculateScoreQuizNull()  throws Exception
	{
		JQ = new JumbledQuiz(1, null, answers);

		assertFalse(JQ.makeQuiz());
		assertTrue(JQ.getUserAnswers(userAnswers));
		
		int actual = JQ.calculateScore(), expected = 3;
		
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testViewQuiz()  throws Exception
	{
		JQ = new JumbledQuiz(1, questions, answers);
		assertTrue(JQ.makeQuiz());
		assertTrue(JQ.getUserAnswers(userAnswers));
		
		assertTrue(JQ.viewQuiz());
	}

	@Test(expected = Exception.class) 
	public void testViewQuizNull()  throws Exception
	{
		JQ = new JumbledQuiz(1, null, answers);

		JQ.makeQuiz();
		JQ.getUserAnswers(userAnswers);
		
		assertFalse(JQ.viewQuiz());

	}
	
	@Test
	public void testDeleteQuiz()  throws Exception
	{
		JQ = new JumbledQuiz(1, questions, answers);
		JQ.makeQuiz();
		JQ.getUserAnswers(userAnswers);
		
		JQ.deleteQuiz();
	}

}
