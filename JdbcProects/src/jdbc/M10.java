package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M10 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shankar");
		Statement stmt = con.createStatement();
		String s = "select sno as t_no, name as t_name from test";
		ResultSet rs = stmt.executeQuery(s);
		while(rs.next())
		{
			System.out.print(rs.getInt("t_no") + ", ");
			System.out.print(rs.getString("t_name"));
			System.out.println();
		}
		System.out.println("done");
	}
}
