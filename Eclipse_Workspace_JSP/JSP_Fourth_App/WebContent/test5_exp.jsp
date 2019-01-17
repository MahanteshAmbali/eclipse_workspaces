<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id = "p1" class = "com.lara.Person" scope = "session"/>
Firstname: <jsp:getProperty property="firstName" name = "p1"/></br>
Lastname: <jsp:getProperty property="lastName" name = "p1"/></br>
Age: <jsp:getProperty property="age" name = "p1"/></br>
</body>
</html>