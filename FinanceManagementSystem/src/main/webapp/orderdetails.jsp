<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Details</title>
</head>
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

<h1>View Order</h1>




<table>
<tr>

<td>${emi.emioption}</td>
<td>${emi.emioption}</td>
<td>${emi.enddate}</td>
<td>${emi.paidamount}</td>
<td>${emi.balanceamountt}</td>
</tr>
</table>
</body>
</html>