<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Result</title>

<script>
function validateForm() {
    let roll = document.forms["myForm"]["rollno"].value;
    let name = document.forms["myForm"]["name"].value;

    if (roll === "" || name === "") {
        alert("USN and Name must be filled out");
        return false;
    }

    let subjects = ["sub1","sub2","sub3","sub4","sub5"];

    for (let i = 0; i < subjects.length; i++) {
        let marks = document.forms["myForm"][subjects[i]].value;

        if (marks === "" || isNaN(marks) || marks < 0 || marks > 100) {
            alert("Enter valid marks (0-100)");
            return false;
        }
    }
    return true;
}
</script>

</head>

<body>
<h2>Enter Student Details</h2>

<form name="myForm" action="ResultServlet" method="post" onsubmit="return validateForm()">

Roll No: <input type="text" name="rollno"><br><br>
Name: <input type="text" name="name"><br><br>

Sub1: <input type="text" name="sub1"><br><br>
Sub2: <input type="text" name="sub2"><br><br>
Sub3: <input type="text" name="sub3"><br><br>
Sub4: <input type="text" name="sub4"><br><br>
Sub5: <input type="text" name="sub5"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>