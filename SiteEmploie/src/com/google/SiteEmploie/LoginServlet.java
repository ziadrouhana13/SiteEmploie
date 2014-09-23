package com.google.SiteEmploie;

import com.google.SiteEmploie.dto.LoginBean;
import com.google.SiteEmploie.service.LoginService;
import java.io.IOException;
import java.io.PrintStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginServlet
extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException
{
System.out.println("**Login Controller");
resp.setContentType("text/html");
String custid = req.getParameter("web_un").trim();
String pswd = req.getParameter("web_pass");
if ("".equals(custid))
{
req.setAttribute("emtkey", "yes");
RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
rd.forward(req, resp);
}
else
{
LoginBean lbc = null;
lbc = new LoginService().getUserPwd(custid, pswd);
if (lbc.getFname() != null)
{
HttpSession session = req.getSession(true);
session.setAttribute("login", lbc);
RequestDispatcher rdl = req.getRequestDispatcher("home.jsp");
rdl.forward(req, resp);
}
else
{
req.setAttribute("emtkey", "yes");
RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
rd.forward(req, resp);
}
System.out.println("**Login Controller Ends");
}
}
public void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException
{
System.out.println("### home ###");
RequestDispatcher rdl = req.getRequestDispatcher("home.jsp");
rdl.forward(req, resp);
}
}