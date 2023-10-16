package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class M12 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shankar");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		String tableName = sc.next();
		String s = "select * from " + tableName;
		ResultSet rs = stmt.executeQuery(s);
		ResultSetMetaData rsm = rs.getMetaData();
		int cols = rsm.getColumnCount();
		while(rs.next())
		{
			for(int i = 1; i <= cols; i++)
			{
				System.out.print(rs.getString(i) + ", ");
			}
			System.out.println();
		}
	}
}
