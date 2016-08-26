package LibrarySystemForEmployees;

import java.util.Scanner;

public class testClass 
{
	public static void main(String[] args) 
	{
		String empName;
		int empID;
		int bookCode;
		String bookType;
		String issueDate;
		
		Scanner scanner = new Scanner(System.in);
		
		empName = scanner.nextLine();
		empID = scanner.nextInt();
		bookCode = scanner.nextInt();
		bookType = scanner.next();
		issueDate = scanner.next();
		scanner.close();
		
		Employee E = new Employee(empID, empName, bookCode, bookType, issueDate);
		
		if(E.createBookDetails())
			System.out.println("Created Book in the Database");
		else
			System.out.println("Please check the book");
		
		E.returnBook();
		
		System.out.println(E);
	}
}
