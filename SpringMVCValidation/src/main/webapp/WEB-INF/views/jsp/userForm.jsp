<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Add a new user</title>
</head>
<body>
	 <h1>Add a new user2</h1>
	 <!-- no need to action be cause both get & post has the same url --> 
	 <form:form modelAttribute="newUser" > 
	 <fieldset>
		<!-- type is text by default => no need to be added -->
		<!-- access with ModelAttr Items by name in qute for Model Items by dollar sign-->
		<p>
			User name :
			<form:input path="name" />
		</p>
		<p>
			Email :
			<form:input path="email" />
		</p>
		<p>
			Birthday:
			<form:input path="birthday" />
		</p>
		<p>
			Age :
			<form:input path="age" />
		</p>
		<p>
			Role :
			<form:select path="role">
				<!--  default option should not have any value-->
				<form:option value="">select role</form:option>
				<form:options items="${roles}" />
			</form:select>
		</p>
		<p>Address information :</p>
		<!-- address field in User is by the name of Addr -->
		<p>
			Street :
			<form:input path="addr.street" />
		</p>
		<p>
			State :
			<form:input path="addr.state" />
		</p>
		<p>
			zip code :
			<form:input path="addr.zipcode" />
		</p>

		<!--it is better to set value because different browser have different name for submit btn  -->
		<input type="submit" value="Add" />
		</fieldset> 
	 </form:form>  

</body>
</html>