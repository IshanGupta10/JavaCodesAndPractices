package AssignmentUML;

import java.util.*;

public abstract class QuizBaseClass 
{
	protected int quizCode;
	protected int quizScore;
	protected List<List<String>> answers;
	protected LinkedHashSet<String> questions;
	protected LinkedHashMap<Integer, String> questionSet;
	protected LinkedHashMap<Integer, List<String>> answerSet;
	protected LinkedHashMap<Integer, List<String>> userAnswers;
	
	abstract public boolean makeQuiz() throws Exception;
	abstract public int calculateScore() throws Exception;
	abstract protected int evaluateQuiz();
	abstract public boolean viewQuiz() throws Exception;
	abstract public void deleteQuiz();
	abstract public boolean getUserAnswers(List<List<String>> answers) throws Exception;
	abstract public boolean modifyQuiz(int questionNumber, List<String> answers) throws Exception;	
}