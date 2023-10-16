package jdbc;
import java.sql.*;
public class M8 {
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"system","shankar");
		Statement stmt = con.createStatement();
		String s = "delete from test where sno = 8";
		stmt.execute(s);
		System.out.println("done");
	}
}
