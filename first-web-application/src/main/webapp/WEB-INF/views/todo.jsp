<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>

<p> Your Todo List are:</p>
<ol>
	<C:forEach items="${todos}" var="todo">
		<li> ${todo.name}</li>
	</C:forEach>
	
</ol>
</body>
</html>


