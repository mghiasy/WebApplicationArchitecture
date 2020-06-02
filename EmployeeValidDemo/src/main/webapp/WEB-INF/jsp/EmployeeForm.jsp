<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>employeeForm.title</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<p><a href="?language=en_US">English</a> <a href="?language=fa_FA">فارسی</a></p>
<div id="global">
<form:form modelAttribute="employee" action="employee_save" method="post">
    <fieldset>
        <legend>employeeForm.title</legend>
  		<p>
  		     <form:errors path="*" cssStyle="color : red;" /> 
        </p>

        <p>
            <label for="firstName">employeeForm.firstName </label>
           <form:input path="firstName" />
 	
 		  	<div style="text-align: center;">
 				<form:errors path="firstName" cssStyle="color : red;" /> 
 			</div>
       </p>
        <p>
            <label for="lastName">employeeForm.lastName </label>
           <form:input path="lastName" />
 
 		  	<div style="text-align: center;">
 				<form:errors path="lastName" cssStyle="color : red;" /> 
 			</div>
       </p>

        <p>
            <label for="birthDate">employeeForm.dateOfBirth </label>
            <form:input path="birthDate" id="birthDate" />
 			<form:errors path="birthDate" cssStyle="color : red;" /> 
        </p>
        <p>
            <label for="salaryLevel">employeeForm.salary </label>
            <form:input path="salaryLevel" id="salaryLevel" />
 
 		  	<div style="text-align: center;">
 				<form:errors path="salaryLevel" cssStyle="color : red;" /> 
 			</div>
       </p>
    <h4>employeeForm.address</h4>
        <p>
            <label for="street">employeeForm.street</label>
            <form:input path="address.street" id="street" />
 
 		  	<div style="text-align: center;">
 				<form:errors path="address.street" cssStyle="color : red;" /> 
 			</div>
       </p>
        <p>
            <label for="state">employeeForm.state</label>
            <form:input path="address.state" id="state" />
 
 		  	<div style="text-align: center;">
 				<form:errors path="address.state" cssStyle="color : red; " /> 
 			</div>
       </p>
        <p>
            <label for="zipCode">employeeForm.zip </label>
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
