<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>User saved successfully</h1>
<!-- attrs are match to domain -->
<p>Name : ${savedUser.name} </p>
<p>Email : ${savedUser.email} </p>
<p> Birthday : ${savedUser.birthday} </p>
<p> Age : ${savedUser.age}</p>
<p> Role : ${savedUser.role} </p>

<h2>Address info :</h2>
<p>Street : ${savedUser.addr.street} </p>
<p>State : ${savedUser.addr.state } </p>
<p>Zipcode : ${savedUser.addr.zipcode } </p>
</body>
</html>