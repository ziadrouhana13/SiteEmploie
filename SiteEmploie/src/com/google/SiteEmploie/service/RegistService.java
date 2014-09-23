package com.google.SiteEmploie.service;


import com.google.SiteEmploie.dao.RegisterDB;
import com.google.SiteEmploie.dto.RegesterBean;
import java.io.PrintStream;
import java.sql.SQLException;
public class RegistService
{
public RegesterBean getRegister(RegesterBean rbc)
throws SQLException
{
System.out.println("++++++++++++++++++Register Service ++++++++++++ ");
RegesterBean rb = rbc;
System.out.println("Address : " + rb.getAddress());
rb = new RegisterDB().getregData(rb);
System.out.println("++++++++++++++++++Register Service Ends ++++++++++++ ");
return rb;
}
String rnd = Double.toString(Math.random());
String[] splt = this.rnd.split("\\.");
String s1 = this.splt[1];
public String substr1 = this.s1.substring(1, 6);
public String substr2 = this.s1.substring(11, 14);
public boolean containsOnlyNumbers(String str)
{
System.out.println(" into validate numbers ");
if (str.length() == 0) {
return false;
}
for (int i = 0; i < str.length(); i++) {
if (!Character.isDigit(str.charAt(i)))
{
System.out.println(str + " not a number ");
return false;
}
}
System.out.println(str + " number only");
return true;
}
}
