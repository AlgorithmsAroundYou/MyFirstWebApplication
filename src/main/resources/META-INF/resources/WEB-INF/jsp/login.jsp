<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<div class="container">
	<h1 style="color: #769cdf">Welcome To The Login Page !!</h1>
	<pre style="color: #ea2d13">${errorMessage}</pre>
	
	<form method="post">
		<b>Name :<input type="text" name="name"></b>
		
		 <b>Password : <input type="password" name="password"></b>
		 <br><br>
		 <input type="submit">
	</form>
	
</div>
<body>

</body>
</html>