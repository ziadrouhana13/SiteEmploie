package com.google.SiteEmploie.utility;


import java.io.IOException;
import java.io.PrintStream;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class UrlFilter
implements Filter
{
public void destroy() {}
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
throws IOException, ServletException
{
System.out.println(" !!!! Filter @@ Invokes !!!! ");
HttpServletRequest req = (HttpServletRequest)request;
HttpServletResponse resp = (HttpServletResponse)response;
HttpSession session = req.getSession(false);
if (session != null) {
chain.doFilter(req, resp);
} else {
resp.sendRedirect("index.jsp");
}
}
public void init(FilterConfig arg0)
throws ServletException
{}
}