package com.google.SiteEmploie.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBsinglton
{
private static Connection con;
private static final DBsinglton ONE = new DBsinglton();
private DBsinglton()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ib", "root", "root");
}
catch (ClassNotFoundException e)
{
e.printStackTrace();
}
catch (SQLException e)
{
e.printStackTrace();
}
}
public static DBsinglton bsinglton()
{
return ONE;
}
public static Connection connection()
{
return con;
}
}