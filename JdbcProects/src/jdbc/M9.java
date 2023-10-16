package jdbc;

import java.sql.*;

public class M9 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shankar");
		Statement stmt = con.createStatement();
		String sql = "select * from test";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getInt(1) + ", ");
			System.out.print(rs.getString(2));
			System.out.println();
		}
	}
}
