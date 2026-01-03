<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List" %>
    <%@ page import="com.example.mvcsaveget.entity.Login" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<%
    // Retrieve the list of Login objects from request attribute
    List<Login> logins = (List<Login>) request.getAttribute("loginData");
    
    if (logins != null) {
        for (Login login : logins) {
%>
            <p>Username: <%= login.getUsername() %></p>
            <p>Password: <%= login.getPassword() %></p>
<%
        }
    } else {
%>
        <p>No login data found.</p>
<%
    }
%>
</body>
</html>
