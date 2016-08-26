<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign In</title>
</head>
<body>
<h2>Sign In</h2>
<form method="POST" action="RegisterServlet">
	<input type="text" name="username" value=<%=request.getAttribute("uname") %> placeholder="Enter UserName"/>
	<input type="password" name="pwd" />
	<input type="submit" value="Sign In"/>
</form>
</body>
</html>