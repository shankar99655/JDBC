package jdbc.trycath;

//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class M1 {
	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		
		java.sql.Connection con = null;
		Statement stmt = null;
		try
		{
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String un = "system";
			String pw = "shankar";
			con = DriverManager.getConnection(url, un, pw);
			stmt = con.createStatement();
			String sql = "create table shankar(id number, name varchar2(30), age number, gender char(1))";
			stmt.execute(sql);
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(stmt != null)
				{
					stmt.close();
					stmt = null;
				}
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(con != null)
				{
					con.close();
					con = null;
				}
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
