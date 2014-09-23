package com.google.SiteEmploie.dao;

import com.google.SiteEmploie.dto.RegesterBean;
import com.google.SiteEmploie.utility.DBsinglton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class UserDetailDB
{
Connection con = DBsinglton.connection();
Statement stmt;
ResultSet rs;
public RegesterBean getAccno(String accno)
throws SQLException
{
RegesterBean rb = new RegesterBean();
String sql = "select * from register where username='" + accno + "'";
this.stmt = this.con.createStatement();
this.rs = this.stmt.executeQuery(sql);
while (this.rs.next())
{
rb.setFname(this.rs.getString(1));
rb.setLname(this.rs.getString(2));
rb.setAddress(this.rs.getString(3));
rb.setGender(this.rs.getString(4));
rb.setPhone(this.rs.getString(5));
rb.setPasswd(this.rs.getString(6));
rb.setEmail(this.rs.getString(7));
rb.setBirthday(this.rs.getString(8));
rb.setUsername(this.rs.getString(9));
}
return rb;
}
}
