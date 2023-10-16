package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

public class M7 {
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"system", "shankar");
		Statement stmt = con.createStatement();
		String sql = "update test set name = 'gowtham' where sno = 8";
		stmt.execute(sql);
		System.out.println("done");
	}
}
