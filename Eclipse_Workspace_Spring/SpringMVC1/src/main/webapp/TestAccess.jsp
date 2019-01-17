<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Access</title>
</head>
<body>
<%@page import = "org.spring.mvc.Test" %>
<% 
	Test t1 = new Test();
	String s1 = t1.sayHello();
	PrintWriter out1 = response.getWriter();
	out1.println(s1);
 %>
</body>
</html>