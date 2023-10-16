package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class M2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"system","shankar");
		java.sql.Statement stmt = con.createStatement();
		
		String s1 = "drop table test cascade constraints";
		String s2 = "create table test(sno number, name varchar2(30))";
		
		stmt.execute(s1);
		stmt.execute(s2);
		System.out.println("done");
		
		con.close();
		
	}
}
