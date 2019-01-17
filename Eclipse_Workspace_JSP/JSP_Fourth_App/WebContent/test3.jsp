<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import = "com.lara.Person" %>
<%
	Person p1 = new Person();
	p1.setFirstName("Mahantesh");
	p1.setLastName("Ambalie");
	p1.setAge(29);
	
	out.println("Firstname: "+p1.getFirstName());
	out.println("</br>Lastname: "+p1.getLastName());
	out.println("</br>Age: "+p1.getAge());
%>
</body>
</html>