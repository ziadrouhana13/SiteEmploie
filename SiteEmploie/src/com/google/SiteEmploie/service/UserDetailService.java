package com.google.SiteEmploie.service;

import com.google.SiteEmploie.dao.UserDetailDB;
import com.google.SiteEmploie.dto.RegesterBean;
import java.sql.SQLException;
public class UserDetailService
{
public RegesterBean getUsrAccno(String accno)
throws SQLException
{
RegesterBean rb = new RegesterBean();
rb = new UserDetailDB().getAccno(accno);
return rb;
}
}