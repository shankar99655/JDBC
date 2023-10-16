package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class M3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"system", "shankar");
		java.sql.Statement stmt = con.createStatement();
		String s1 = "insert into test values(1, 'shankar')";
		String s2 = "insert into test values(2, 'tamil')";
		String s3 = "insert into test values(3, 'mani')";
		String s4 = "insert into test values(4, 'chinnarasu')";
		
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		stmt.execute(s4);
		System.out.println("done");
		con.close();
	}
}
