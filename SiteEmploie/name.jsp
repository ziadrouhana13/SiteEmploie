<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.employmentapp.dto.LoginBean"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
LoginBean lbj=(LoginBean)session.getAttribute("login");
%>
<br>	Welcome :<i> <%=lbj.getFname()+" "+lbj.getLname() %></i><br>
<br>
</body>
</html>