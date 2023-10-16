package jdbc;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class M5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"system","shankar");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name, sql;
		Integer id;
		Statement stmt = con.createStatement();
		do
		{
			System.out.println("enter id");
			id = sc.nextInt();
			System.out.println("enter name");
			name = sc.next();
			sql = "insert into test values(" + id + ",'" + name + "')";
			stmt.execute(sql);
			System.out.println("do you want add one more enter(yes/no)");
		}while("yes".equalsIgnoreCase(sc.next()));
	}
}
