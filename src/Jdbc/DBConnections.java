package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.rules.Verifier;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class DBConnections {
	public Connection conn;
	public Statement stat;
	public ResultSet rs;
	String str;
	
	public void dbconnection() throws Exception
	{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
conn=DriverManager.getConnection(
		   "jdbc:sqlserver://Welcome Rupak;databasename=Emp","scott","tiger");
stat = conn.createStatement();
rs = stat.executeQuery("select * from EMP where name='Nagesh'");
while(rs.next()){
	str=rs.getString("Emp Name");
	System.out.println(rs.getInt("Column Name"));
	System.out.println(str);
	System.out.println(rs.getInt("Salary"));
}

}
  @Test
  public void f() throws Exception {
	  dbconnection();
  }
}


//oracle.jdbc.driver.OracleDriver
//connection = DriverManager.getConnection("jdbc:sqlserver://MINDQ-PC;databasename=mq","setAuthentication=true");












