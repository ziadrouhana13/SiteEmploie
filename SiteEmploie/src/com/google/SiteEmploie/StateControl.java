package com.google.SiteEmploie;

import com.google.SiteEmploie.dto.StateBean;
import com.google.SiteEmploie.service.StateService;
import java.io.IOException;
import java.io.PrintStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class StateControl
extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException
{
StateBean usr = new StateService().getitabcdefg();
System.out.println("############### State Controler ###########");
req.setAttribute("userkey", usr);
RequestDispatcher rdp = req.getRequestDispatcher("register.jsp");
rdp.forward(req, resp);
System.out.println("#### Sates are successfull added ####");
}
}