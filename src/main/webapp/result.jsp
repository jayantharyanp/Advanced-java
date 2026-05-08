<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Result</title>
</head>

<body>

<h2>Student Result Details</h2>

<table border="1" cellpadding="10">

<tr>
    <th>Field</th>
    <th>Value</th>
</tr>

<tr>
    <td>Roll Number</td>
    <td><%= request.getAttribute("rollno") %></td>
</tr>

<tr>
    <td>Student Name</td>
    <td><%= request.getAttribute("sname") %></td>
</tr>

<tr>
    <td>Subject 1</td>
    <td><%= request.getAttribute("sub1") %></td>
</tr>

<tr>
    <td>Subject 2</td>
    <td><%= request.getAttribute("sub2") %></td>
</tr>

<tr>
    <td>Subject 3</td>
    <td><%= request.getAttribute("sub3") %></td>
</tr>

<tr>
    <td>Subject 4</td>
    <td><%= request.getAttribute("sub4") %></td>
</tr>

<tr>
    <td>Subject 5</td>
    <td><%= request.getAttribute("sub5") %></td>
</tr>

<tr>
    <td>Average Marks</td>
    <td><%= request.getAttribute("average") %></td>
</tr>

<tr>
    <td>Result</td>
    <td><%= request.getAttribute("result") %></td>
</tr>

</table>

<br>

<a href="index.jsp">

    Move to Client Side Page

</a>

</body>
</html>