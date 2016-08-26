package LibrarySystemForEmployees;

import static org.junit.Assert.*;
import org.junit.Test;

public class DataAnalyticsTest 
{
	DataAnalytics DA;
	Technology Tech;
	Management Manage;
	
	@Test (expected = Exception.class)
	public void checkEMP()
	{
		Employee E = new Employee(001, "Ishan", 100, "DataAnalytics", "2003-10-20");
		E.createBookDetails();
	}
}
