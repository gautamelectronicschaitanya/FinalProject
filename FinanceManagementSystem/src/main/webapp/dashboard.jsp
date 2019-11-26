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
			<th>Name</th>
			<th>CARD NUMBER</th>
			<th>VADIL TILL</th>
			<TH>CARD TYPE</TH>
			<TH>CARD STATUS</TH>
			<th>TOTAL CREDIT</th>
		</tr>

		<tr>
			<td>${name}</td>
			
				<td>${cardD.cardno}</td>
				<td>${cardD.validdate}</td>
				<td>${cardD.cardtype}</td>
				<td>${cardD.cardstatus }</td>
				<td>${cardD.totalcredit }</td>
				<td><a href="editemp/${emp.id}">Edit</a></td>
				<td><a href="deleteemp/${emp.id}">Delete</a></td>
		</tr>
		
	</table>
	
	<h2>
	product purchased
	</h2>
	<table  border="2" width="70%" cellpadding="2">
	<tr>
	<td>PRODUCT NAME</td>
	<td>AMOUNT</td>
	<td>PAID</td>
	<td>BALANCE</td>
	<th>
	</tr>
	<tr>
	<c:forEach var="p" items="${product}">
	<td></td>
	
	
	</c:forEach>
	</tr>
	</table>
</body>
</html>