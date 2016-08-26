package AssignmentUML;

import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SingleOrMultipleChoiceTest
{
	QuizBaseClass SOMC;
	File fileQ = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/Questions.txt");
	File fileA = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/AnswersSOMC.txt");
	File fileUA = new File("C:/Users/igupt2/Documents/JavaSession/AssignmentUML/QuizBaseClassTest/AssignmentUML/UserAnswersSOMC.txt");
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
		SOMC = new SingleOrMultipleChoice(1, questions, answers);
		
		assertTrue(SOMC.makeQuiz());
	}
	

	@Test
	public void testMakeQuizQANull() throws Exception
	{
		SOMC = new SingleOrMultipleChoice(1, null, null);
	}
	
	@Test
	public void testGetUserAnswers()  throws Exception
	{
		SOMC = new SingleOrMultipleChoice(1, questions, answers);
		
		assertTrue(SOMC.getUserAnswers(userAnswers));
	}
	
	@Test
	public void testGetUserAnswersUserAnswersNull() throws Exception
	{
		SOMC = new SingleOrMultipleChoice(1, questions, answers);
	}

	@Test
	public void testModify() throws Exception
	{
		SOMC = new SingleOrMultipleChoice(1, questions, answers);
		
		List<String> vaList = new ArrayList<String>();
		vaList.add("GurgaonNCR");

		assertTrue(SOMC.makeQuiz());
		assertTrue(SOMC.modifyQuiz(4, vaList));
	}

	@Test
	public void testModifyModificationNull() throws Exception
	{
		SOMC = new SingleOrMultipleChoice(1, questions, answers);

		SOMC.makeQuiz();
	}
	
	@Test
	public void testModifyWrongQuestionNumber() throws Exception
	{
		SOMC = new SingleOrMultipleChoice(1, questions, answers);

		List<String> vaList = new ArrayList<String>();
		vaList.add("GurgaonNCR");

		assertTrue(SOMC.makeQuiz());
		assertFalse(SOMC.modifyQuiz(10, vaList));
	}
	
	@Test
	public void testCalculateScore()  throws Exception
	{
		SOMC = new SingleOrMultipleChoice(1, questions, answers);
		assertTrue(SOMC.makeQuiz());
		assertTrue(SOMC.getUserAnswers(userAnswers));
		
		int actual = SOMC.calculateScore(), expected = 3;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testViewQuiz()  throws Exception
	{
		SOMC = new SingleOrMultipleChoice(1, questions, answers);
		assertTrue(SOMC.makeQuiz());
		assertTrue(SOMC.getUserAnswers(userAnswers));
		
		assertTrue(SOMC.viewQuiz());
	}

	
	@Test
	public void testDeleteQuiz()  throws Exception
	{
		SOMC = new SingleOrMultipleChoice(1, questions, answers);
		SOMC.makeQuiz();
		SOMC.getUserAnswers(userAnswers);
		
		SOMC.deleteQuiz();
	}
}
