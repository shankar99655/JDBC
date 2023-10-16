package jdbc;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class M4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"system", "shankar");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		Integer id = sc.nextInt();
		String name = sc.next();
		String query = "insert into test values(" + id + ",'" + name + "')";
		
		stmt.execute(query);
		System.out.println("done" + con);
	}
}
