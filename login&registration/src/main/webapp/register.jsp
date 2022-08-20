<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css">
<title>REGISTRATION</title>
</head>
<body>
<div align=center>
<h1 class=header>REGISTRATION</h1>
<form action=RegisterServlet method=post>
<table class=table>
<tr><td>Enter name:</td><td><input type=text name=name></td></tr>
<tr><td>Enter Email adress:</td><td><input type=text name=email></td></tr>
<tr><td>Enter password:</td><td><input type=password name=pwd></td></tr>
</table>
<button>Register</button>
</form>
</div>
</body>
</html>