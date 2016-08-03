package databaseConnecting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectEmployee 
{
	private static Connection con;

	public static void main(String[] args)
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
			
		System.out.println("Driver loaded");
		try 
		{
			Emp E1 = new Emp(01, "Ishan","388,Sector 23", 39545.50);
			Emp E2 = new Emp(02, "Vikas","Market,Sector 23", 39545.50);
			Emp E3 = new Emp(03, "Varun","Palam Vihar,Sector 23", 39545.50);			
			con = DriverManager.getConnection("jdbc:oracle:thin:@DLUFFLAB100002.sapient.com:1521:xe","KOKEEN","explosmrob10");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("CREATE TABLE EMP (EMPID NUMBER(5), ENAME VARCHAR2(20), EADD VARCHAR2(50), ESALARY NUMBER(5), CONSTRAINT PK_EMP PRIMARY KEY (EMPID))");
//			stmt.executeUpdate("INSERT INTO EMP VALUES(E1.empID,E1.name,E1.address, E1.salary)");
			stmt.executeUpdate("INSERT INTO EMP VALUES("+ E1.empID + ",'"+ E1.name + "','" + E1.address + "'," + E1.salary + ")");
			stmt.executeUpdate("INSERT INTO EMP VALUES("+ E2.empID + ",'"+ E2.name + "','" + E2.address + "'," + E2.salary + ")");
			stmt.executeUpdate("INSERT INTO EMP VALUES("+ E3.empID + ",'"+ E3.name + "','" + E3.address + "'," + E3.salary + ")");
			System.out.println("Inserting to DB...");
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		finally
		{		
			try 
			{
				con.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}			
		System.out.println("Connection done sucessfully");		
	}
}