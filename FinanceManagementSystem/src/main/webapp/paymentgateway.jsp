<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Method</title>
</head>
<body>
	<h1>Choose your emi-option</h1>
	<form action="orderdetails" method="post">  
          Emi opntion:<input type="text" name="emioption"></br>
          Product Id:<input type="text" name="productid"></br>
          User Id:<input type="text" name="userid"></br>        
		<input type="submit" value="Submit" />
	</form>
</body>
</html>