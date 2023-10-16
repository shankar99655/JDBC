package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class M11 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shankar");
		Statement stmt = con.createStatement();
		String s = "select sno as t_no, name as t_name from test";
		ResultSet rs = stmt.executeQuery(s);
		ResultSetMetaData rsm = rs.getMetaData();
		System.out.println(rsm.getColumnCount());
		System.out.println(rsm.getColumnName(1));
		System.out.println(rsm.getColumnName(2));
		System.out.println();
		while(rs.next())
		{
			System.out.print(rs.getInt("t_no") + ", ");
			System.out.print(rs.getString("t_name"));
			System.out.println();
		}
		System.out.println("done");
	}
}
