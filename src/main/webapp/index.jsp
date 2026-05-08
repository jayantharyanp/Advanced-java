<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Expiry Demo</title>
</head>

<body>

<h2>Session Management using JSP</h2>

<form action="welcome.jsp" method="post">

    Enter Your Name:
    <input type="text"
           name="username"
           required>

    <br><br>

    Enter Session Expiry Time (minutes):
    <input type="number"
           name="time"
           required>

    <br><br>

    <input type="submit"
           value="Submit">

</form>

</body>
</html>