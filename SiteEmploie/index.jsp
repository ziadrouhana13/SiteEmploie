
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body background="img/login.gif" >
<img src="img/jobs.gif"> <br/>
<HR color= "lightbrown"></HR>
<FORM METHOD=POST ACTION="home">
<div align="right"><font color="red">Click here to <A HREF="register">register</A></font>
</div>
Member ID<BR>
<INPUT TYPE="text" NAME="web_un"><BR>
Password<BR>
<INPUT TYPE="password" NAME="web_pass"><BR>
<%
String error=(String)request.getAttribute("emtkey");
if(error !=null){%>
<font color="red">The customer id or password you entered is incorrect.</font>
<%}
%>
<TABLE>
<TR>
<TD>&nbsp;&nbsp;</TD>
<TD>&nbsp;&nbsp;</TD>
<TD>&nbsp;&nbsp;</TD>
<TD>&nbsp;&nbsp;</TD>
<TD>&nbsp;&nbsp;</TD>
<TD>&nbsp;&nbsp;</TD>
<TD>&nbsp;&nbsp;&nbsp;&nbsp;<INPUT TYPE="submit" value="Login"></TD>
</TR>
</TABLE>
</FORM>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<p>	<font color="#7A5229">&copy; Copyright ZIAD ROUHANA</font> </p>
</body>
</html>