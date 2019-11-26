<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans&display=swap"
	rel="stylesheet">
<body>
	<style>
h1 {
	font-family: 'Open Sans', sans-serif;
}

h2 {
	font-family: 'Open Sans', sans-serif;
}

/* Add a black background color to the top navigation */
.topnav {
	background-color: #0066cc;
	overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
	float: right;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
	background-color: #66b3ff;
	color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
	background-color: #66b3ff;
	color: white;
}
</style>
	<div class="topnav">
	    <a href="logout.jsp">Logout</a> 
	    <a href="product_catalog">Products</a>
		<a href="contact.jsp">Contact</a>
		<a class="active" href="index.jsp">Home</a>
	</div>

	<h1 align="center">Dashboard</h1>
	<h2 align="center">Welcome ${name}</h2>
	<h3 align="center">Your EMI CARD DETAILS</h3>
	<table align="center" border="2" width="90%" cellpadding="30">
		<tr>

			<th>CARD NUMBER</th>
			<th>ISSUE DATE</th>
			<th>VADIL TILL</th>
			<TH>CARD TYPE</TH>
			<TH>CARD STATUS</TH>
			<th>CREDIT LIMIT</th>

		</tr>

		<tr>
			<td>${cardD.cardno}</td>
			<td>${cardD.issuedate}</td>
			<td>${cardD.validdate}</td>
			<td>${cardD.cardtype}</td>
			<td>${cardD.cardstatus}</td>
			<td>${cardD.cardlimit}</td>
		</tr>

	</table>
</body>
</html>