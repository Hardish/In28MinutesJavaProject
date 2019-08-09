<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
<p> welcome  ${name}  </p>
<p>Todo List are:</p>
<ol>
	<C:forEach items="${todos}" var="todo">
		<li> ${todo.name}</li>
	</C:forEach>
</ol>

<form action="/todo.do" method="post">

<input type="text" name="todo"/>
<input type="submit" value="Add"/>

</form>
</body>
</html>


