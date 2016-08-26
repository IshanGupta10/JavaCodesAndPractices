package testServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SignInServlet() {
        // TODO Auto-generated constructor stub
    	User user = new User("", "", "");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getParameter("username");
		String password = request.getParameter("pwd");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String hobbies = request.getParameter("hobbies");
		String music[] = request.getParameterValues("music");
		String dob = request.getParameter("date");
		String color = request.getParameter("favcolor");
		
		String responseStr = "Failure";
		if(username.equals(password))
		{
			String musicVal = "";
			for(String e : music)
				musicVal += e + " ";
			
			responseStr = "Success \n Username : " + username + " \n Password : " + password 
								+ "\n Gender : " + gender + " \n Age : " + age + " \n Address : "
									+ address + " \n Hobbies : " + hobbies + " \n Date of Birth : "
										+ dob + " \n Music : " + musicVal + " \n Color : " + color;
		}
		
		PrintWriter pw = response.getWriter();
		pw.println(responseStr);
	}

}
