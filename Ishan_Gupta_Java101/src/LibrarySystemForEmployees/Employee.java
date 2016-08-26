package LibrarySystemForEmployees;

import java.time.LocalDate;
import java.time.Period;

public class Employee 
{
	AbstractClassBook DA;
	AbstractClassBook Tech;
	AbstractClassBook Manage;
	Integer empID;
	String empName;
	Integer bookCode;
	String bookType;
	String issueDate;
	Integer lateFees;
	LocalDate today = LocalDate.now();
	int dateDetails[] = new int[3];
	
	public Employee(Integer empID, String empName, Integer bookCode, String bookType, String issueDate) 
	{
		super();
		this.empID = empID;
		this.empName = empName;
		this.bookCode = bookCode;
		this.bookType = bookType;
		this.issueDate = issueDate;
	}
	
	protected void calculateDate ()
	{
		String[] tokenvals = issueDate.split("-");
		dateDetails[0] = Integer.parseInt(tokenvals[0]);
		dateDetails[1] = Integer.parseInt(tokenvals[1]);
		dateDetails[2] = Integer.parseInt(tokenvals[2]);
	}
	
	protected Integer calculateFees() 
	{
		LocalDate today = LocalDate.now();
		LocalDate issueDay = LocalDate.of(dateDetails[0], dateDetails[1], dateDetails[2]);
		Period daysCount = Period.between(issueDay, today);
		
		if(bookType.equals("Data Analytics"))
		{
			if(daysCount.getDays() > 7)
				return (5 * (daysCount.getDays() - 7));
			else
				return 0;
		}
		else if(bookType.equals("Technology"))
		{
			if(daysCount.getDays() > 7)
				return (6 * (daysCount.getDays() - 7));
			else
				return 0;
		}
		else if (bookType.equals("Management")) 
		{
			if(daysCount.getDays() > 7)
				return (7 * (daysCount.getDays() - 7));
			else
				return 0;	
		}
		return 0;
	}

	public Integer getEmpID() 
	{
		return empID;
	}

	public void setEmpID(Integer empID) 
	{
		this.empID = empID;
	}

	public String getEmpName() 
	{
		return empName;
	}

	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}

	public Integer getBookCode() 
	{
		return bookCode;
	}

	public void setBookCode(Integer bookCode) 
	{
		this.bookCode = bookCode;
	}

	public String getBookType() 
	{
		return bookType;
	}

	public void setBookType(String bookType) 
	{
		this.bookType = bookType;
	}

	public String getIssueDate() 
	{
		return issueDate;
	}

	public void setIssueDate(String issueDate) 
	{
		this.issueDate = issueDate;
	}
	
	public boolean createBookDetails() 
	{
		if(this.bookType.equals("Data Analytics"))
		{
			DA = new DataAnalytics(this.bookCode, this.issueDate, true);
			try 
			{
				if(DA.saveBookDetails())
					System.out.println("Book Stored. \n");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			lateFees = calculateFees();
			
		}
		else if(this.bookType.equals("Technology"))
		{
			Tech = new Technology(this.bookCode, this.issueDate, true);
			try 
			{
				if(Tech.saveBookDetails())
					System.out.println("Book Stored. \n");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			lateFees = calculateFees();
		}
		else if (this.bookType.equals("Management")) 
		{
			Manage = new Management(this.bookCode, this.issueDate, true);
			try 
			{
				if(Manage.saveBookDetails())
					System.out.println("Book Stored. \n");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			lateFees = calculateFees();
		}
		return true;
	}
	
	public void returnBook() 
	{
		if(this.bookType.equals("Data Analytics"))
		{
			try 
			{
				if(DA.returnBook(bookCode))
					System.out.println("Book Returned. \n");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		else if(this.bookType.equals("Technology"))
		{
			try 
			{
				if(Tech.returnBook(bookCode))
					System.out.println("Book Returned. \n");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		else if (this.bookType.equals("Management")) 
		{
			try 
			{
				if(Manage.returnBook(bookCode))
					System.out.println("Book Returned. \n");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString()
	{
		return "Employee empID = " + empID + "\n empName = " + empName + "\n bookCode = " + bookCode + "\n bookType = " + bookType
				+ "\n issueDate = " + issueDate + "\n returndate = " + today + "\n lateFees = " + lateFees;
	}
	
}
