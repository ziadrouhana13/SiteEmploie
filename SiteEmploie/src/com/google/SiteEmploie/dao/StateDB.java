package com.google.SiteEmploie.dao;

import com.google.SiteEmploie.dto.StateBean;
import com.google.SiteEmploie.utility.DBsinglton;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class StateDB
{
String query = "SELECT * FROM state_tbl";
PreparedStatement pstmt;
ResultSet rs;
String[] str = new String[28];
int i = 0;
public StateBean getState()
{
StateBean st = new StateBean();
DBsinglton.bsinglton();Connection con = DBsinglton.connection();
try
{
this.pstmt = con.prepareStatement(this.query);
this.rs = this.pstmt.executeQuery();
while (this.rs.next())
{
this.str[this.i] = this.rs.getString("States");
this.i += 1;
}
}
catch (SQLException e)
{
e.printStackTrace();
}
st.setStates(this.str);
System.out.println("************** State DB ****************");
return st;
}
}
