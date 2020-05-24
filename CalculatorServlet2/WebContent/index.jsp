<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC 2 Calculator</title>
</head>
<body>
<%-- <jsp:forward page="calculator"/> --%>
<!-- <p><a href="/CalculatorServlet2/calc2">Calculator</a></p> -->

<!-- ********************* -->
<!-- enables you to forward an HTTP request to a static HTML file, a servlet, or another JSP. 
It has an attribute called page, which accepts the URL of another resource -->

 <jsp:forward page="/WEB-INF/calculator.jsp"/> 

</body>
</html>