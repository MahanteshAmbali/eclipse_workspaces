<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center><h1>Product Services System</h1></center>
	<hr><hr>
	<form action="Add" method = "post">
	Product Id:
		<input type = 'text' name = 'productId'><br>
	Product Name:
		<input type = 'text' name = 'productName'><br>
	Product Model No:
		<input type = 'text' name = 'productModelNo'><br>
	Product Price:
		<input type = 'text' name = 'productPrice'><br>
	Product Condition:
		<input type = 'text' name = 'productCondition'><br>
	Product Availability:
		<input type = 'text' name = 'productAvailability'><br>
		
		<input type = 'submit' value = 'Add'><br>
		
	</form>
</body>
</html>