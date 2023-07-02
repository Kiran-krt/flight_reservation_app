<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>Login here</h2>
	${error}
	<form action="verifyLogin" method="get">
	Email Id:<input type="text" name="emailId"/><br/>
	Password:<input type="password" name="password"/>
	<input type="submit" value="login">
	</form>

</body>
</html>