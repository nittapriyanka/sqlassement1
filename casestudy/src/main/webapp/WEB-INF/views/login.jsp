<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<h2>${errorMsg}</h2>
<form method="post"> 
<input type="text" name="username" placeholder="Username" />
<br>
<input type="password" name="password" placeholder="Password" />
<br>
<button>submit</button>
<button>reset</button></form>

</body>
</html>