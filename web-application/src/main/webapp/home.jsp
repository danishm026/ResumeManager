<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resume Manager</title>
<link type="text/css" rel="stylesheet" href=<c:url value="resources/css/general.css" /> />
</head>
<body>
	<jsp:include page="includes/header.jsp" />
	
	<div id="login">
		<h2>Login:</h2>
		<p class="error">${loginMessage}</p>
		<form action="login" method="post">
			<p>Roll Number: <input type="text" name="rollNumber" id="loginRollnumber"/></p>
			<p>Password: <input type="password" name="password">
			<p><input type="submit" value="Login" id="loginButton"/></p>
		</form>
	</div>
	
	<div>
		<h2>Register:</h2>
		<form action="register" method="post">
			<p>Roll Number: <input type="text" name="rollNumber" id="registrationRollNumber"/></p>
			<p>E-mail: <input type="email" name="email" id="registrationEmail" /></p>
			<p>Password: <input type="password" name="password" id="registrationPassword" /></p>
			<p>Confirm Password: <input type="password" name="confirmedPassword" id="comfirmedPassword" /></p>
			<p><input type="submit" value="Register" id="registerButton" /></p>					
		</form>
	</div>
	
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/home.js"></script>
</body>
</html>