package AssignmentUML;

class QuizQuestionException extends Exception
{
	String excp;
	private static final long serialVersionUID = 1L;



	public QuizQuestionException(String excp) 
	{
		this.excp = excp;
	}

	@Override
	public String toString() 
	{
		return "QuizQuestionException: " + excp ;
	}

	
}