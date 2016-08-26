package testRegister;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	Map<String, User> usersMap = new HashMap<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String respStr = "";
		String user = request.getParameter("username");
		if(usersMap.containsKey(user)){
			respStr = "{\"exists\":true}";
		}
		else{
			respStr = "{\"exists\":false}";
		}
		response.setContentType("application/json");
		response.getWriter().println(respStr);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("pwd");
		String confirmPassword = request.getParameter("cpwd");
		
		User user = new User(username, password, confirmPassword);
//		Write DB code find if user exists, if no insert a record
		if(!usersMap.containsKey(username)){
			usersMap.put(username, user);
			System.out.println(usersMap);
			request.setAttribute("uname", username);
			
			RequestDispatcher rd = request.getRequestDispatcher("Signin.jsp");
			rd.forward(request, response);
		}
		else{
			RequestDispatcher rd = request.getRequestDispatcher("testFile.html");
//			request.setAttribute("message", "Registration failed - Try with another user");
			rd.forward(request, response);
		}
	}

}
