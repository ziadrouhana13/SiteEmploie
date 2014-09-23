<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.google.SiteEmploie.dto.LoginBean"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body bgcolor="ivory">
<%@include file="header1.jsp" %>
<div align="right"><A HREF="logout"><INPUT TYPE="image"
align="right" SRC="img/logout.gif" height="34" width="34" onclick="location.href='logout';" > </A></div>	
<%
LoginBean lbj=(LoginBean)session.getAttribute("login");
%>Welcome : <%=lbj.getFname()+" "+lbj.getLname() %> <br>
<br> Account number:<%=lbj.getUsername() %>
<center><B><h1> Welcome </h1> </B></center>
<BR><BR>
<center><I><A HREF="detail">My Info</A></I></center></H2>
<br><br><br>
<%@include file="footer.jsp"%>
</body>
</html>