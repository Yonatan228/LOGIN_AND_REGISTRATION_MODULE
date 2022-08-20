<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<meta charset="UTF-8">
<title>sign in</title>
</head>
<body>
<div align=center>
<h1 class=header>LOGIN</h1>
<form action=LoginServlet method=post>
<table class=table>
<tr><td>Enter name:</td><td><input type=text name=name></td></tr>
<tr><td>Enter password:</td><td><input type=password name=pwd></td></tr>
</table>
<button>login</button>
</form>
<div class=link1>
<a href="<%=request.getContextPath()%>/register.jsp">Create an account</a>
<h3>incorrect user name or password<br>Please try again</h3>
</div>
</div>
</body>
</html>