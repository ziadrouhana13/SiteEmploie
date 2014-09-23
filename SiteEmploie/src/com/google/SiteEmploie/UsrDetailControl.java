package com.google.SiteEmploie;

import com.google.SiteEmploie.dto.LoginBean;
import com.google.SiteEmploie.dto.RegesterBean;
import com.google.SiteEmploie.service.UserDetailService;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class UsrDetailControl
extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException
{
HttpSession session = req.getSession(false);
LoginBean lb = (LoginBean)session.getAttribute("login");
String accno = lb.getUsername();
try
{
RegesterBean rb = new RegesterBean();
rb = new UserDetailService().getUsrAccno(accno);
session.setAttribute("usrkey", rb);
RequestDispatcher view = req.getRequestDispatcher("userdetail.jsp");
view.forward(req, resp);
}
catch (SQLException e)
{
e.printStackTrace();
}
}
}
