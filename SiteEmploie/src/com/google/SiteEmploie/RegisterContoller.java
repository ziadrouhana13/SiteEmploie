package com.google.SiteEmploie;

import com.google.SiteEmploie.dto.RegesterBean;
import com.google.SiteEmploie.dto.StateBean;
import com.google.SiteEmploie.service.RegistService;
import com.google.SiteEmploie.service.StateService;

import java.io.IOException;
import java.io.PrintStream;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegisterContoller
extends HttpServlet
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException
{
System.out.println("* Start Register Controller");
String fistnm = req.getParameter("fn").trim();
for (int i = 0; i < fistnm.length(); i++) {
if (Character.isDigit(fistnm.charAt(i)))
{
StateBean usr = new StateService().getitabcdefg();
req.setAttribute("errall", "error");
req.setAttribute("userkey", usr);
RequestDispatcher rdp = req.getRequestDispatcher("register.jsp");
rdp.forward(req, resp);
}
}
String lstnm = req.getParameter("ln").trim();
for (int i = 0; i < lstnm.length(); i++) {
if (Character.isDigit(lstnm.charAt(i)))
{
StateBean usr = new StateService().getitabcdefg();
req.setAttribute("errall", "error");
req.setAttribute("userkey", usr);
RequestDispatcher rdp = req.getRequestDispatcher("register.jsp");
rdp.forward(req, resp);
}
}
String username = req.getParameter("username").trim();
for (int i = 0; i < username.length(); i++) {
if (Character.isDigit(username.charAt(i)))
{
StateBean usr = new StateService().getitabcdefg();
req.setAttribute("errall", "error");
req.setAttribute("userkey", usr);
RequestDispatcher rdp = req.getRequestDispatcher("register.jsp");
rdp.forward(req, resp);
}
}
boolean b;
String strdd = req.getParameter("dd").trim();
b = new RegistService().containsOnlyNumbers(strdd);
if (!b)
{
StateBean usr = new StateService().getitabcdefg();
req.setAttribute("errall", "error");
req.setAttribute("userkey", usr);
RequestDispatcher rdp = req.getRequestDispatcher("register.jsp");
rdp.forward(req, resp);
}
String strmm = req.getParameter("mm").trim();
b = new RegistService().containsOnlyNumbers(strmm);
if (!b)
{
StateBean usr = new StateService().getitabcdefg();
req.setAttribute("errall", "error");
req.setAttribute("userkey", usr);
RequestDispatcher rdp = req.getRequestDispatcher("register.jsp");
rdp.forward(req, resp);
}
String stryy = req.getParameter("year").trim();
b = new RegistService().containsOnlyNumbers(stryy);
if (!b)
{
StateBean usr = new StateService().getitabcdefg();
req.setAttribute("errall", "error");
req.setAttribute("userkey", usr);
RequestDispatcher rdp = req.getRequestDispatcher("register.jsp");
rdp.forward(req, resp);
}
String phone = req.getParameter("phone").trim();
b = new RegistService().containsOnlyNumbers(phone);
if (!b)
{
StateBean usr = new StateService().getitabcdefg();
req.setAttribute("errall", "error");
req.setAttribute("userkey", usr);
RequestDispatcher rdp = req.getRequestDispatcher("register.jsp");
rdp.forward(req, resp);
}
String email = req.getParameter("email").trim();
String address = req.getParameter("address").trim();
String gender = req.getParameter("gender");
String pwd = req.getParameter("password");
String username1 = req.getParameter("username");
int dd = Integer.parseInt(strdd);
int mm = Integer.parseInt(strmm);
int yy = Integer.parseInt(stryy);
System.out.println("your name: " + fistnm);
System.out.println("Gender :" + gender);
if ("".equals(address))
{
StateBean usr = new StateService().getitabcdefg();
req.setAttribute("err", "error");
req.setAttribute("userkey", usr);
RequestDispatcher rdp = req.getRequestDispatcher("register.jsp");
rdp.forward(req, resp);
}
else if (("".equals(email)))
{
StateBean usr = new StateService().getitabcdefg();
req.setAttribute("userkey", usr);
RequestDispatcher rdp = req.getRequestDispatcher("register.jsp");
rdp.forward(req, resp);
}
else
{
RegesterBean rbc = new RegesterBean();
RegistService rs = new RegistService();
System.out.println("**************else loop valid success********");
String birthday = dd + "/" + mm + "/" + yy;
System.out.println(birthday);
rbc.setAddress(address);
rbc.setFname(fistnm);
rbc.setBirthday(birthday);
rbc.setEmail(email);
rbc.setGender(gender);
rbc.setLname(lstnm);
rbc.setPasswd(pwd);
rbc.setPhone(phone);
rbc.setUsername(username1);
System.out.println("//////////////////////////////////");
System.out.println("End of else loop");
try
{
rbc = new RegistService().getRegister(rbc);
req.setAttribute("usracc", rbc);
RequestDispatcher rd = req.getRequestDispatcher("account.jsp");
rd.forward(req, resp);
}
catch (SQLException e)
{
e.printStackTrace();
resp.sendRedirect("Copy of error.jsp");
}
}
System.out.println("* End of Register Controller");
}
}

