package com.google.SiteEmploie.service;

import com.google.SiteEmploie.dao.StateDB;
import com.google.SiteEmploie.dto.StateBean;
import java.io.PrintStream;
public class StateService
{
public StateBean getitabcdefg()
{
System.out.println("Sate Service Starts");
StateBean sb = new StateDB().getState();
System.out.println("Sate Service Ends");
return sb;
}
}
