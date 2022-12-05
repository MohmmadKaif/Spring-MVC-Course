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
 The tag '<form:form/>' is a tag provided by spring MVC. There is a special attribute modelAttribute where in we provide the the name for it. 
 This name will be used for accessing the student object which was set in model object.  
 
 The tag '<form:input/>' is a special tag provided by MVC to take input. But there is something extra that this tag provides us.
 The path attribute is used to set the data in student object. 
 Now one thing to keep in mind is that the value which is set in this attribute is supposed to be same as the name of the field name which is there in Student class. 
 For example: firstName and the lastName.
-->
<form:form action="loadResponseForm" modelAttribute="student">
<!--Here we are taking the input and at the same time we are setting it in firstName and lastName which are the field name inside the Student class-->
FIRST NAME<form:input path="firstName"/><br><br>
LAST NAME<form:input  path="lastName"/><br><br>
<button type="submit">ADD</button>
</form:form>
</body>
</html>