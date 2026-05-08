<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Result Form</title>

<script>

function validateForm()
{
    var rollno =
        document.forms["myForm"]["rollno"].value;

    var sname =
        document.forms["myForm"]["sname"].value;

    if(rollno == "")
    {
        alert("Roll Number cannot be empty");
        return false;
    }

    if(sname == "")
    {
        alert("Student Name cannot be empty");
        return false;
    }

    // Validate marks
    for(var i=1; i<=5; i++)
    {
        var mark =
            document.forms["myForm"]["sub"+i].value;

        if(mark == "")
        {
            alert("Subject " + i + " mark is required");
            return false;
        }

        if(mark < 0 || mark > 100)
        {
            alert("Marks should be between 0 and 100");
            return false;
        }
    }

    return true;
}

</script>

</head>

<body>

<h2>Student Result Form</h2>

<form name="myForm"
      action="ResultServlet"
      method="post"
      onsubmit="return validateForm()">

    Roll Number:
    <input type="text" name="rollno">

    <br><br>

    Student Name:
    <input type="text" name="sname">

    <br><br>

    Subject 1:
    <input type="number" name="sub1">

    <br><br>

    Subject 2:
    <input type="number" name="sub2">

    <br><br>

    Subject 3:
    <input type="number" name="sub3">

    <br><br>

    Subject 4:
    <input type="number" name="sub4">

    <br><br>

    Subject 5:
    <input type="number" name="sub5">

    <br><br>

    <input type="submit" value="Calculate Result">

</form>

</body>
</html>