<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is login Page</h1>
	
	<form action="loginSucess" method="post">
	
		<input type="text" placeholder="Enter username" name="username" id="username" required="required"><br><br>
		<input type="password" placeholder="password" name="password" id="password" required="required"><br><br>
		<input type="submit" value="login">
		
	</form>
</body>
</html>