<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Processor</title>
</head>
<body>
<%@page errorPage = "errorHandler.jsp" %>
<%
	String s1 = request.getParameter("param1");
	String s2 = request.getParameter("param2");
	
	int num1 = Integer.parseInt(s1);
	int num2 = Integer.parseInt(s2);
	
	int result = num1/num2;
	
	out.println("Div of nums is: "+result);
 %>
</body>
</html>