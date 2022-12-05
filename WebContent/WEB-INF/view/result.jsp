<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 
Here we are accessing the data sent in the Model object 
This is how we access the data using the Expression Language. Below is the syntax for same.
-->

The name ${student.firstName} ${student.lastName}  is verified. 
</body>
</html>