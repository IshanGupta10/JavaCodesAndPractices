<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*,java.util.*, testServlet.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<%/* 
String username = request.getParameter("username");
String password = request.getParameter("password");
String confpass = request.getParameter("confpass");
User user = new User(username, password, confpass); */

User U1 = new User("Ishan", "Gupta", "Gupta");
User U2 = new User("Vikas", "Pathak", "Pathak");
User U3 = new User("Varun", "Nair", "Nair");

ArrayList<User> users = new ArrayList<User>();
users.add(U1);
users.add(U2);
users.add(U3);
%>

<table class="table table-hover">
<% 
	for(User U : users)
	{%>
		<tr>
		<td><%=U.getUsername() %></td>
		<td><%=U.getPassword() %></td>
		<td><%=U.getConfpass() %></td>
		</tr>
	<% 
	}
	%>
</table>
</body>
</html>