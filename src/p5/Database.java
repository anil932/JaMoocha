package p5;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database 
{
  public static Connection getCon()
  {
	 Connection con=null; 
	 try
	 {
		 Class.forName("oracle:jdbc:OracleDriver");
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","system");
	 }
	 catch(Exception e)
	 {
		e.printStackTrace(); 
		
	 }
	 return con;
  }
}
