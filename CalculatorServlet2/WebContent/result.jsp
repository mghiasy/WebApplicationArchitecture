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
	<form action="showClaculator" method="post">
    <fieldset>
        <legend>add your number</legend>
                <input type = 'text' size = '2' name = 'add1' value="${form.num1}">+
                <input type = 'text' size = '2' name = 'add1' value="${form.num2}">=
                <input type = 'text' size = '4' name = 'sum' value="${form.sum}" readonly>
                <input type = 'text' size = '2' name = 'mult1' value="${form.mult1}">*
                <input type = 'text' size = '2' name = 'mult2' value="${form.mult2}">=
                <input type = 'text' size = '4' name = 'product' value="${form.product}" readonly>
            <p id="buttons">
                <input id="submit" type="submit" value="Submit">
            </p>
    </fieldset>
    </form>
</body>
</html>