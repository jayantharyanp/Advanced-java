<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>

<body>

<%

String name =
        request.getParameter("username");

String time =
        request.getParameter("time");

// Convert minutes to seconds
int expiry =
        Integer.parseInt(time) * 60;

// Store name in session
session.setAttribute("uname", name);

// Set session expiry
session.setMaxInactiveInterval(expiry);

%>

<h2>
    Hello <%= name %> !
</h2>

<p>
    Session expiry time set to
    <%= time %> minute(s).
</p>

<br>

<a href="checkSession.jsp">

    Click Here to Check Session

</a>

</body>
</html>