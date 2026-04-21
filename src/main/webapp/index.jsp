<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Result Form</title>

    <script>
        function validateForm() {
            let form = document.forms["form"];

            let roll = form["rollno"].value.trim();
            let name = form["name"].value.trim();

            if (roll === "" || name === "") {
                alert("Roll No and Name are required!");
                return false;
            }

            for (let i = 1; i <= 5; i++) {
                let mark = form["sub" + i].value;

                if (mark === "" || mark < 0 || mark > 100) {
                    alert("Marks must be between 0 and 100");
                    return false;
                }
            }

            return true;
        }
    </script>
</head>
<body>

<h2>Student Result Form</h2>

<form name="form" action="ResultServlet" method="post" onsubmit="return validateForm()">

    Roll No: <input type="text" name="rollno" required><br><br>
    Name: <input type="text" name="name" required><br><br>

    Sub1: <input type="number" name="sub1" min="0" max="100" required><br><br>
    Sub2: <input type="number" name="sub2" min="0" max="100" required><br><br>
    Sub3: <input type="number" name="sub3" min="0" max="100" required><br><br>
    Sub4: <input type="number" name="sub4" min="0" max="100" required><br><br>
    Sub5: <input type="number" name="sub5" min="0" max="100" required><br><br>

    <input type="submit" value="Calculate Result">

</form>

</body>
</html>