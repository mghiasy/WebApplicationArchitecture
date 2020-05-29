<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>
	<form action="calculator">
		<input type="text" name="add1" size="2" value="" />+ 
		<input type="text" name="add2" value="" size="2" />=
		<input type="text" name="sum" value="" size="2" readonly /><br /> 
		<input type="text" name="mult1" value="" size="2" />* 
		<input type="text" name="mult2" value="" size="2" />=
		<input type="text" name="product" value="" size="2" readonly /><br /> 
		<input type="submit" value="Submit" />

	</form>
</body>
</html>