<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>

<body>

<%

    String name = request.getParameter("username");

    // Store username in session
    session.setAttribute("uname", name);

    // Session expiry time = 1 minute
    session.setMaxInactiveInterval(60);

%>

<h2>
    Hello <%= session.getAttribute("uname") %> !
</h2>

<p>
    Session will expire in 1 minute.
</p>

</body>
</html>