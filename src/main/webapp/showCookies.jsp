<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Active Cookies</title>
</head>

<body>

<h2>Active Cookie List</h2>

<%

Cookie cookies[] = request.getCookies();

if(cookies != null)
{
%>

<table border="1" cellpadding="10">

<tr>
    <th>Cookie Name</th>
    <th>Cookie Value</th>
</tr>

<%

for(Cookie c : cookies)
{
%>

<tr>

<td>
    <%= c.getName() %>
</td>

<td>
    <%= c.getValue() %>
</td>

</tr>

<%
}
%>

</table>

<%
}
else
{
%>

<h3>No Active Cookies Found!</h3>

<%
}
%>

</body>
</html>