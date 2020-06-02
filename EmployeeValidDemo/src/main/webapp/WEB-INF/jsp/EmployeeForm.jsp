<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE HTML>
<html>
<head>
<title><spring:message code ="employeeForm.title" text ="Add Employee Form"/> </title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<p><a href="?language=en_US">English</a> | <a href="?language=fa_FA">فارسی</a></p>
<div id="global">
<form:form modelAttribute="employee" action="employee_save" method="post">
    <fieldset>
        <legend><spring:message code ="employeeForm.title" text ="title"/> </legend>
  		<p>
  		     <form:errors path="*" cssStyle="color : red;" /> 
        </p>

        <p>
            <label for="firstName"><spring:message code ="employeeForm.firstName" text ="firstName"/></label>
           <form:input path="firstName" />
 	
 		  	<div style="text-align: center;">
 				<form:errors path="firstName" cssStyle="color : red;" /> 
 			</div>
       </p>
        <p>
            <label for="lastName"><spring:message code ="employeeForm.lastName" text ="lastName"/> </label>
           <form:input path="lastName" />
 
 		  	<div style="text-align: center;">
 				<form:errors path="lastName" cssStyle="color : red;" /> 
 			</div>
       </p>

        <p>
            <label for="birthDate"><spring:message code ="employeeForm.dateOfBirth" text ="dateOfBirth"/> </label>
            <form:input path="birthDate" id="birthDate" />
 			<form:errors path="birthDate" cssStyle="color : red;" /> 
        </p>
        <p>
            <label for="salaryLevel"><spring:message code ="employeeForm.salary" text ="salary"/> </label>
            <form:input path="salaryLevel" id="salaryLevel" />
 
 		  	<div style="text-align: center;">
 				<form:errors path="salaryLevel" cssStyle="color : red;" /> 
 			</div>
       </p>
    <h4><spring:message code ="employeeForm.address" text ="address"/></h4>
        <p>
            <label for="street"><spring:message code ="employeeForm.street" text ="street"/> </label>
            <form:input path="address.street" id="street" />
 
 		  	<div style="text-align: center;">
 				<form:errors path="address.street" cssStyle="color : red;" /> 
 			</div>
       </p>
        <p>
            <label for="state"><spring:message code ="employeeForm.state" text ="state"/></label>
            <form:input path="address.state" id="state" />
 
 		  	<div style="text-align: center;">
 				<form:errors path="address.state" cssStyle="color : red; " /> 
 			</div>
       </p>
        <p>
            <label for="zipCode"><spring:message code ="employeeForm.zip" text ="zip"/> </label>
            <form:input path="address.zipCode" id="zipCode" />
 	
 		  	<div style="text-align: center;">
 				<form:errors path="address.zipCode" cssStyle="color : red; " /> 
 			</div>
       </p>
        <p id="buttons">
            <input id="submit" type="submit"  value="Add Employee">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
