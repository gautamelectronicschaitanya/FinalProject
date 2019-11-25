<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hello Customer</h1>
	<form method="POST" action="dashboard">
		<table>
			<tr>
				<td>User Name :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>PassWord :</td>
				<td><input type="text" name="password"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="SUBMIT" /></td>
			</tr>
		</table>
	</form>
</body>
</html>