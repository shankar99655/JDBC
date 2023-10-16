package jdbc;

import java.sql.*;

public class FirstJdbc {
	public static void main(String[] args) throws  SQLException, ClassNotFoundException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"system", "shankar");
		Statement stmt = con.createStatement();
		String s = "create table test(sno number)";
		stmt.execute(s);
		System.out.println("done");
	}
}
