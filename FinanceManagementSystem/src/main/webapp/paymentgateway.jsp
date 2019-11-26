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
	<a href="conformation">Choose your payment method</a>

	<form:form action="submitForm" modelAttribute="reservation">  
      
        EMI OPTION:   
        THREE MONTH<form:radiobutton path="Gender" value="THREEM" />  
        FOUR MONTH<form:radiobutton path="Gender" value="FOURM" />
		<br>
		<br>  
        Meals:  
        BreakFast<form:checkbox path="Food" value="BreakFast" />  
        Lunch<form:checkbox path="Food" value="Lunch" />  
        Dinner<form:checkbox path="Food" value="Dinner" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>





</body>
</html>