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

String name = request.getParameter("username");

// Store name in session
if(name != null)
{
    session.setAttribute("uname", name);

    // Session expiry = 1 minute
    session.setMaxInactiveInterval(60);
}

// Get session value
String uname =
        (String)session.getAttribute("uname");

if(uname != null)
{
%>

<h2>
    Hello <%= uname %> !
</h2>

<p>
    Session expires in 1 minute.
</p>

<%
}
else
{
%>

<h2>Session Expired!</h2>

<a href="index.jsp">
    Login Again
</a>

<%
}
%>

</body>
</html>