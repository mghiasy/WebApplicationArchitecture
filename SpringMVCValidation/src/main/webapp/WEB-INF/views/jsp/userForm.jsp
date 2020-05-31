<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Add a new user</title>
<style>
.error{
color : red}
</style>
</head>
<body>
	 <h1>Add a new user2</h1>
	 <!-- no need to action be cause both get & post has the same url --> 
	 <form:form modelAttribute="newUser" > 
	 <fieldset>
	 <form:errors path = "*" cssClass="error" /> <!-- to show all the errors here -->
		<!-- type is text by default => no need to be added -->
		<!-- access with ModelAttr Items by name in qute for Model Items by dollar sign-->
		<p>
			User name :
			<!-- to add the errors related to field name beside it to show the errors related to name-->
			<form:input path="name" /> <form:errors path="name" cssClass="error" />
		</p>
		<p>
			Email :
			<form:input path="email" /> <form:errors path="email" cssClass="error" />
		</p>
		<p>
			Birthday:
			<form:input path="birthday" /> <form:errors path="birthday" cssClass="error" />
		</p>
		<p>
			Age :
			<form:input path="age" /> <form:errors path="age" cssClass="error" />
		</p>
		<p>
			Role :
			<form:select path="role"> 
				<!--  default option should not have any value-->
				<form:option value="">select role</form:option>
				<form:options items="${roles}" />
			</form:select> <form:errors path="role" cssClass="error" /> <!-- should be after select -->
		</p>
		<p>Address information :</p>
		<!-- address field in User is by the name of Addr -->
		<p>
			Street :
			<form:input path="addr.street" /> <form:errors path="addr.street" cssClass="error" />
		</p>
		<p>
			State :
			<form:input path="addr.state" /> <form:errors path="addr.state" cssClass="error" />
		</p>
		<p>
			zip code :
			<form:input path="addr.zipcode" /> <form:errors path="addr.zipcode" cssClass="error" />
		</p>

		<!--it is better to set value because different browser have different name for submit btn  -->
		<input type="submit" value="Add" />
		</fieldset> 
	 </form:form>  

</body>
</html>