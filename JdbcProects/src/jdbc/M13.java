package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class M13 {
	public static void main(String[] args) {
		//1. registering the driver connection
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException ex) 
		{
			ex.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		
		try
		{
			// 2. establishing the database connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shankar");
			//3. create a statement
			stmt = con.createStatement();
			//4.composing the sql command
			String sql = "create table student(id number, name varchar(30), age number)";
			//5. executing the sql command
			stmt.execute(sql);
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			//6. close the database connection
			if(stmt != null)
			{
				try
				{
					stmt.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
				}
			}
			if(con != null)
			{
				try 
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
				}
			}
		}
		System.out.println("done");
	}
}
