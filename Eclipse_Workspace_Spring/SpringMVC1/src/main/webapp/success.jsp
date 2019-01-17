<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
Successfully Exceuted Spring MVC Tut 1.!
</body>
</html>
<%@page import = "java.lang.System" %>
<%@include file = "index.jsp"%>

<%
	long endTime = System.nanoTime();
%>
<br>

Time Required for this Web App is :
<%=(endTime - beginTime)/1000 %> microSeconds