package LibrarySystemForEmployees;

import java.util.LinkedHashMap;

abstract public class AbstractClassBook 
{
	Integer bookCode;
	String bookName;
	String issueDate;
	String returnDate;
	boolean isIssued;
	Pair<String, Boolean> bookDetails;
	LinkedHashMap<Integer, Pair<String, Pair<String, Boolean>>> bookDataBase;
	
	abstract public boolean setBookCode(Integer code) throws Exception;
	abstract public Integer getBookCode(String bookName) throws Exception;
	abstract public boolean setIssueDate(String issueDate) throws Exception;
	abstract public String getIssueDate(Integer code) throws Exception;
	abstract public boolean setBookName(String bookName) throws Exception;
	abstract public String getBookName(Integer code) throws Exception;
	abstract public boolean isBookIssued(Integer code) throws Exception;
	abstract public boolean saveBookDetails() throws Exception;
	abstract public boolean returnBook(Integer code) throws Exception;
}
