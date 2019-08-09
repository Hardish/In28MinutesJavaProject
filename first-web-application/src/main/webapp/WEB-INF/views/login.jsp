
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> <!-- this is default and it will use html5-->
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo..... !!! From JSP </title>
</head>

<body>
<form action="/login.do" method="post">
<p><font color="RED"> ${errorMessage }</font></p>
Enter Your Name: <input type="text" name="name"/>
Password:        <input type="password" name="password"/>
				<input type="submit" value="login"/>
</form>
</body>
</html>