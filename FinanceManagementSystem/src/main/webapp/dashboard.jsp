<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<h1>Dashboard</h1>
	<a href="product_catalog">Products</a>
	<h2>Welcome ${credential}</h2>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>CARD NUMBER</th>
			<th>VADIL TILL</th>
			<TH>CARD TYPE</TH>
		</tr>

		<tr>
			<c:forEach var="v" items="${cardDetails}">
				<td>${v.cardno}</td>
				<td>${v.validdate}</td>
				<td>${v.cardtype}
				<td><a href="editemp/${emp.id}">Edit</a></td>
				<td><a href="deleteemp/${emp.id}">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>