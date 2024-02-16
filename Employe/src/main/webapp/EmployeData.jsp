<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="RegistrationServlet" method="post">
        Employee ID: <input type="text" name="EmploId" readonly="readonly" value="<%= new java.util.Random().nextInt(1000000) %>"><br>
        Employee Name: <input type="text" name="empName"><br>
        Date of Joining: <input type="date" name="doj"><br>
        Basic Salary: <input type="text" name="basicSal"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>



