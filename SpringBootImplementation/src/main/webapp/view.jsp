<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome Employee, Please provide your details(Id, Name, Dept, Tech) <%=request.getRequestURI() %>
<!-- This code is to just view UI component and send multiple inputs in single request -->
<form action="view">
<input type=text name="empId">
<input type=text name="empName">
<input type=text name="empDept">
<input type=text name="empTech">
<input type="submit"><br>
</form>
</body>
</html>