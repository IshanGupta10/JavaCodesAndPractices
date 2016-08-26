package LibrarySystemForEmployees;

import java.util.LinkedHashMap;

public class Management extends AbstractClassBook
{
	public Management(Integer bookCode, String issueDate, boolean isIssued) 
	{
		super();
		this.bookCode = bookCode;
		this.bookName = "";
		this.issueDate = issueDate;
		this.isIssued = isIssued;
	}
	
	public boolean saveBookDetails() throws Exception
	{
		Pair<String, Boolean> bookValue = new Pair<String, Boolean>(issueDate, true);
		Pair<String, Pair<String, Boolean>> details = new Pair<String, Pair<String, Boolean>>(bookName, bookValue);
		bookDataBase = new LinkedHashMap<Integer, Pair<String, Pair<String, Boolean>>>();
		
		bookDataBase.put(bookCode, details);
		
		if(bookDataBase != null)
			return true;
		else
			throw new Exception("Please check the Book Code wrt the book exists!");
	}
	
	public boolean setBookCode(Integer bookCode) throws Exception
	{
		if(this.bookCode != null)
			this.bookCode = bookCode;
		else
			throw new Exception("Please check the Book Code wrt the book exists!");

		return true;
	}
	
	public Integer getBookCode(String bookName) throws Exception
	{
		if(this.bookName != null)
			return this.bookCode;
		else
			throw new Exception("Please check the Book Code wrt the book exists!");
	}
	
	public boolean setIssueDate(String issueDate) throws Exception
	{
		if(this.issueDate != null)
			this.issueDate = issueDate;
		else
			throw new Exception("Please check the Book Code wrt the book exists!");
		
		return true;
	}
	
	public String getIssueDate(Integer code) throws Exception
	{
		if(this.issueDate != null)
			return this.issueDate;
		else
			throw new Exception("Please check the Book Code wrt the book exists!");
	}
	
	public boolean setBookName(String bookName) throws Exception
	{
		if(this.bookName != null)
			this.bookName= bookName;
		else
			throw new Exception("Please check the Book Code wrt the book exists!");
		
		return true;
	}
	
	public String getBookName(Integer bookCode) throws Exception
	{
		if(this.bookCode != null)
			return this.bookName;
		else
			throw new Exception("Please check the Book Code wrt the book exists!");
	}
	
	public boolean isBookIssued(Integer code) throws Exception
	{
		if(this.bookCode != null)
			return this.isIssued;
		else
			throw new Exception("Please check the Book Code wrt the book exists!");
	}
	
	public boolean returnBook(Integer code) throws Exception
	{
		if(bookDataBase != null)
		{
			bookDataBase.remove(code);
			return true;
		}
		else
			throw new Exception("Please check the Book Code wrt the book exists!");
	}
}
