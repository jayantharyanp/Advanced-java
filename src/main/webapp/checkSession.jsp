<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Session</title>
</head>

<body>

<%

String uname =
        (String)session.getAttribute("uname");

if(uname != null)
{
%>

<h2>
    Hello <%= uname %> !
</h2>

<p>
    Session is still active.
</p>

<%
}
else
{
%>

<h2>
    Session Expired!
</h2>

<a href="index.jsp">

    Login Again

</a>

<%
}
%>

</body>
</html>