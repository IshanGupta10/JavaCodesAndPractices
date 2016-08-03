package AssignmentUML;

import java.util.*;

public class NumericApproximation extends QuizBaseClass
{
	public NumericApproximation(int quizCode, LinkedHashSet<String> questions, List<List<String>> answers) 
	{
		this.quizCode = quizCode;
		this.questions = questions;
		this.answers = answers;
	}
	
	public boolean makeQuiz() throws Exception
	{
		int i = 0, j = 0;
		
			if(questions != null && answers != null)
			{
				questionSet = new LinkedHashMap<Integer, String>();
				Iterator<String> itrQ = questions.iterator();
				answerSet = new LinkedHashMap<Integer, List<String>>();
				Iterator<List<String>> itrA = answers.iterator(); 
				
				while(itrQ.hasNext())
				{
					String value = (String) itrQ.next();
					questionSet.put(new Integer(i + 1), value);
					++i;
				}

				while(itrA.hasNext()) 
				{
					List<String> list = (List<String>) itrA.next();
					answerSet.put(new Integer(j + 1), list);
					++j;
				}
			}
			else
			{
				throw new Exception("Please check the inputs!");
			}
		
		return true;
	}
	
	public boolean getUserAnswers(List<List<String>> Answers) throws Exception
	{
		int i = 0;
		
			if(Answers != null)	
			{
				userAnswers = new LinkedHashMap<Integer, List<String>>();
				Iterator<List<String>> itrA = Answers.iterator();
				
				while(itrA.hasNext())
				{
					List<String> value = (List<String>) itrA.next();
					userAnswers.put(new Integer(i + 1), value);
					i++;
				}
			}
			else
			{
				throw new Exception("Please check the inputs!");
			}

		return true;
	}
	
	public boolean modifyQuiz(int questionNumber, List<String> Answers) throws Exception
	{
			if(Answers != null)
			{
				Integer qNumber = new Integer(questionNumber);
				List<String> answerNew = Answers;

				try
				{
					if(questionSet.containsKey(qNumber) && answerSet.containsKey(qNumber))
					{
						answerSet.put(qNumber, answerNew);
					}
					else
						throw new QuizQuestionException("Question / Answer Not found.");
				}
				catch(QuizQuestionException Q)
				{
					System.out.println(Q);
					return false;
				}
			}
			else
			{
				throw new Exception("Please check the inputs!");
			}

		return true;
	}
	
	protected int evaluateQuiz() 
	{
		int scoreOfQuiz = 0;
		
		Iterator itrA = answerSet.entrySet().iterator();
		Iterator itrQ = questionSet.entrySet().iterator();
		Iterator itrU = userAnswers.entrySet().iterator();
		
		while(itrA.hasNext() && itrQ.hasNext() && itrU.hasNext())
		{
			HashMap.Entry pairA = (HashMap.Entry)itrA.next();
			HashMap.Entry pairU = (HashMap.Entry)itrU.next();
			
				if(pairA.getKey().equals(pairU.getKey()))
				{
					if (pairA.getValue().equals(pairU.getValue())) 
					{
						scoreOfQuiz++;
					}
					else
						continue;
				}
		}
		return scoreOfQuiz;
	}
	
	public int calculateScore() throws Exception
	{
			if(answerSet != null && questionSet != null && userAnswers != null)
			{
				return evaluateQuiz();
			}
			else
			{
				throw new Exception("Cannot evaluate quiz, Quiz or UserAnswers missing!");
			}
	}
	
	public boolean viewQuiz() throws Exception
	{
			if(answerSet != null && questionSet != null)
			{
				Iterator itrA = answerSet.entrySet().iterator();
				Iterator itrQ = questionSet.entrySet().iterator();
				
				while(itrA.hasNext() && itrQ.hasNext())
				{
					HashMap.Entry pairQ = (HashMap.Entry)itrQ.next();
					HashMap.Entry pairA = (HashMap.Entry)itrA.next();
					
					if(pairA.getKey().equals(pairQ.getKey()))
						System.out.println("Question : " + pairQ.getValue() + " Answer : " + pairA.getValue() + "\n");
				}
			}
			else
			{
				throw new Exception("Cannot display the Quiz, Please check the inputs!");
			}
	
		return true;
	}
	
	public void deleteQuiz() 
	{
		questionSet.clear();	
		answerSet.clear();
		userAnswers.clear();
	}
}
