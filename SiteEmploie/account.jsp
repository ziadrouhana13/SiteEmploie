<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="img/background.gif">
<img src="img/jobs.gif"> <br/>
<HR color= "lightblue"></HR>
<center>
<h1><font color="green">Thanks for registering</font></h1></center>
<marquee><h3> <font color="orange">WELCOME ... </font> </h3> </marquee>
<br />
<br />
<br />
<center>
<h2><jsp:useBean id="usracc" class="com.google.SiteEmploie.dto.RegesterBean"
scope="request">
</jsp:useBean>
<br>
<br>
password :<i><jsp:getProperty property="passwd" name="usracc" /> </i><br>
<br>
</h2>click here to
<a href="index.jsp"> login </a>
</center>
<br>
<br>
<br>
<br>
<br>
<br>
<p style="background-color:#FFCC66">&copy; Copyright ziad rouhana</p>
</body>
</html>