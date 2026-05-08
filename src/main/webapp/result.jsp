<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>
</head>

<body>

<h2>User Details</h2>

<table border="1" cellpadding="10">

<tr>
    <th>Field</th>
    <th>Value</th>
</tr>

<tr>
    <td>Username</td>

    <td>
        <%= request.getAttribute("username") %>
    </td>
</tr>

<tr>
    <td>Email</td>

    <td>
        <%= request.getAttribute("email") %>
    </td>
</tr>

<tr>
    <td>Designation</td>

    <td>
        <%= request.getAttribute("designation") %>
    </td>
</tr>

</table>

<br>

<a href="index.jsp">

    Move to Client Side Page

</a>

</body>
</html>