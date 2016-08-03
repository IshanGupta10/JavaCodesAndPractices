package databaseConnecting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

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
			con = DriverManager.getConnection("jdbc:oracle:thin:@DLUFFLAB100002.sapient.com:1521:xe","KOKEEN","explosmrob10");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO DEPTD VALUES(01, 'EathPolice', 'Earth')");
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