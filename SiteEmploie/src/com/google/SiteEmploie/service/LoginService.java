package com.google.SiteEmploie.service;


import com.google.SiteEmploie.dao.LoginDb;
import com.google.SiteEmploie.dto.LoginBean;
import java.io.PrintStream;
public class LoginService
{
public LoginBean getUserPwd(String custid, String pswd)
{
System.out.println("** Login Service");
LoginBean lbs = new LoginDb().getUsrPwd(custid, pswd);
System.out.println("Login Service **");
return lbs;
}
}