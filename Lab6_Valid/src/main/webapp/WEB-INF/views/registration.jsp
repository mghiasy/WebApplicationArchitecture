<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
.error{color:red}</style>
</head>
<body>

<h1>Registration Form :</h1><br />
   
    <form:form modelAttribute="student" > 
	 <fieldset>
	 <form:errors path = "*" cssClass="error" /> <!-- to show all the errors here -->
		<!-- type is text by default => no need to be added -->
		<!-- access with ModelAttr Items by name in qute for Model Items by dollar sign-->
		<p>
			Student Id :
			<!-- to add the errors related to field name beside it to show the errors related to name-->
			<form:input path="id" /> <form:errors path="id" cssClass="error" />
		</p>
		<p>
			FirstName :
			<form:input path="firstName" /> <form:errors path="firstName" cssClass="error" />
		</p>
		<p>
			LastName:
			<form:input path="lastName" /> <form:errors path="lastName" cssClass="error" />
		</p>
		<p>
			Email :
			<form:input path="email" /> <form:errors path="email" cssClass="error" />
		</p>
		
			<p>
			Birthday :
			<form:input path="birthday" /> <form:errors path="birthday" cssClass="error" />
		</p>
 		<p>
			Phone :
			<form:input path="phone" /> <form:errors path="phone" cssClass="error" />
		</p>
		
		<input type="submit" value="Add" />
		</fieldset> 
	 </form:form>    
 
</body>
</html>