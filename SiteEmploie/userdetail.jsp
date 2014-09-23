<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.google.SiteEmploie.dto.RegesterBean"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Detail </title>
</head>
<body background="img/background.gif">
<%@include file="header.jsp" %><br><div align="right">
<a href="setting"><img src="img/set.png" height=34 width=34></a></div>
<%@include file="name.jsp"%>
<br><br>
<%
RegesterBean rb = (RegesterBean)session.getAttribute("usrkey");
%><br><br> <center> <b> <i><table>
<TR>
<td>Name : </td>
<TD><%= rb.getFname()%> &nbsp; <%= rb.getLname() %></TD>
</TR>
<tr></tr><tr></tr>
<TR>
<TD>Gender : </TD>
<TD><%= rb.getGender() %></TD>
</TR>
<tr></tr><tr></tr>
<TR>
<TD>Birthday : </TD>
<TD> <%= rb.getBirthday() %> &nbsp;&nbsp;&nbsp;
</TD>
</TR>
<tr></tr><tr></tr>
<TR>
<TD>Address : </TD>
<TD><%= rb.getAddress() %></TD>
</TR>
<tr></tr><tr></tr>
<tr></tr><tr></tr>
<TR>
<TD>phone : </TD>
<TD>+91&nbsp;<%= rb.getPhone() %></TD>
</TR>
<tr></tr><tr></tr>
<TR>
<TD>email : </TD>
<TD><%= rb.getEmail() %></TD>
</TR>
<tr></tr><tr></tr>
<tr></tr><tr></tr>
<TR>
<TD colspan="2" align="center"><font color="green" size="4">Account
Details </font></TD>
</TR>
<tr></tr><tr></tr>
<tr></tr><tr></tr>
<tr></tr><tr></tr>
<TR>
<TD>Password : </TD>
<TD><%= rb.getPasswd() %></TD>
</TR>
</TABLE></i></b></center>
<br><marquee><p>&copy; Copyright ziad rouhana</p></marquee>
</body>
</html>