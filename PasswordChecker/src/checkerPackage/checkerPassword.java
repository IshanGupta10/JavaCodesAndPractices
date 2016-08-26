package checkerPackage;

import java.io.Console;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class checkerPassword
 */
@WebServlet("/checkerPassword")
public class checkerPassword extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkerPassword() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String respStr = "";
		String password = request.getParameter("password");
		
		boolean special = false, upper = false, number = false; 
		boolean sizeTest = password.length() >= 8 && password.length() <= 20;
		boolean atLeastLower = false;
		
		for(int i = 0; i < password.length(); ++i)
		{
			char testChar = password.charAt(i);
			if(testChar >= 'a' && testChar <= 'z')
			{
				atLeastLower = true;
				break;
			}
		}
		
		if(sizeTest && atLeastLower)
		{
			if(password == password.toLowerCase())
			{
				respStr += "Password is Weak!!";
			}
			else
			{
				for(int i = 0; i < password.length(); ++i)
				{
					char testChar = password.charAt(i);
					if(testChar >= 'A' && testChar <= 'Z')
					{
						upper = true;
					}
					if(testChar >= '0' && testChar <= '9')
					{
						number = true;
					}
					if( (testChar <= 'A' && testChar >= 'Z') && (testChar <= '0' && testChar >= '9') && (testChar <= 'a' && testChar >= 'z'))
					{
						special = true;
					}
				}
				if(upper && special && number)
					respStr += "Password is Strong!!";
				else if(upper && number && !special)
					respStr += "Password is Good!!";
				else 
					respStr += "Pasword is Moderate";
			}
		}
		else
		{
			respStr += "Please check the Password!! \n Password should be Greater than 9 and less than 20 characters.";
		}
		response.setContentType("text/html");
		response.getWriter().println(respStr);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String password = request.getParameter("password");
		System.out.println(password);
		doGet(request, response);
		request.setAttribute("password", response);
		RequestDispatcher rd = request.getRequestDispatcher("printResult.jsp");
			rd.forward(request, response);
	}

}