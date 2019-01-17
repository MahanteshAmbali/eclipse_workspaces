<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page session="false"%>
Output from async1.jsp
Type is <%=request.getDispatcherType()%>
<%
System.out.println("Inside Async 1");
  if (request.isAsyncStarted()) {
    request.getAsyncContext().complete();
  }
%>
Completed async request at <%=new java.sql.Date(System.currentTimeMillis())%>
</body>
</html>