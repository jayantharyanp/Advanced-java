<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Cookie</title>
</head>

<body>

<%

String cname = request.getParameter("cname");
String domain = request.getParameter("domain");
int age = Integer.parseInt(request.getParameter("age"));

// Create cookie
Cookie ck = new Cookie(cname, domain);

// Set expiry age
ck.setMaxAge(age);

// Add cookie to response
response.addCookie(ck);

%>

<h2>Cookie Added Successfully!</h2>

<h3>Cookie Information</h3>

<p>
<b>Name:</b> <%= cname %>
</p>

<p>
<b>Domain:</b> <%= domain %>
</p>

<p>
<b>Expiry Age:</b> <%= age %> seconds
</p>

<br>

<a href="showCookies.jsp">
    Go to the Active Cookie List
</a>

</body>
</html>