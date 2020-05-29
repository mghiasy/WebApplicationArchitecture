<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result page</title>
</head>
<body>
result page
<!-- ******************************************* -->
<!-- for view no need to action just set value to be shown-->
<!-- comes from controller side -->
	<!-- <form action="showClaculator" method="post"> -->
	<form >
    <fieldset>
        <legend>add your number</legend>
        <!-- ******************************************* -->
        <!-- get calculator inside requestParam which is by type class calc => can use for inputs -->
                <input type = 'text' size = '2' name = 'add1' value="${calculator.num1}">+
                <input type = 'text' size = '2' name = 'add1' value="${calculator.num2}">=
                <input type = 'text' size = '4' name = 'sum' value="${calculator.sum}" readonly>
                <input type = 'text' size = '2' name = 'mult1' value="${calculator.mult1}">*
                <input type = 'text' size = '2' name = 'mult2' value="${calculator.mult2}">=
                <input type = 'text' size = '4' name = 'product' value="${calculator.product}" readonly>
            <p id="buttons">
                <input id="submit" type="submit" value="Submit">
            </p>
    </fieldset>
    </form>
</body>
</html>