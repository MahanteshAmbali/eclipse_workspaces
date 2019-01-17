<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Data Input Page</title>
</head>
<body>
	<h1>Customer Data Input</h1>
    <form action="register" method="post">
        <table cellpadding="3pt">
            <tr>
                <td>Customer Id :</td>
                <td><input type="text" name="customerId" size="30" /></td>
            </tr>
            <tr>
                <td>Customer Name :</td>
                <td><input type="text" name="customerName" size="30" /></td>
            </tr>
 
            <tr>
                <td>Customer Location : :</td>
                <td><input type="text" name="customerLocation" size="30" /></td>
            </tr>
            <tr>
                <td>Product Name :</td>
                <td><input type="text" name="productName" size="30" /></td>
            </tr>
            <tr>
                <td>Product Quantity: </td>
                <td><input type="text" name="productQuantity" size="30" /></td>
            </tr>
            <tr>
                <td>Phone :</td>
                <td><input type="text" name="phoneNumber" size="30" /></td>
            </tr>
        </table>
        <p />
        <input type="submit" value="Place Order" />
    </form>
</body>
</html>