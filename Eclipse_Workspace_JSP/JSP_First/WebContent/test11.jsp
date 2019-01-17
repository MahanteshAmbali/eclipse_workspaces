<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String s1 = request.getServletPath(); 
   String s2 = response.getContentType();
   String s3 = request.getServerName();
   int  s4 = request.getServerPort();
   String s5 = session.getId();
%>

<%
	out.println("Servlet Path: "+s1);
	out.println("</br>Content Type: "+s2);
	out.println("</br>Server Name:  "+s3);
	out.println("</br>Server Port: "+s4);
	out.println("</br>Session ID: "+s5);
%>

</body>
</html>