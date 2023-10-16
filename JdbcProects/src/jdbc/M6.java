package jdbc;

import java.sql.*;
import java.io.*;

public class M6 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"system", "shankar");
		Statement stmt = con.createStatement();
		FileReader fin = new FileReader("data.txt");
		BufferedReader bin = new BufferedReader(fin);
		String record = bin.readLine();
		String name, data[], sql;
		String id;
		while(record != null)
		{
			data = record.split(",");
			id = data[0].trim();
			name = data[1].trim();
			sql = "insert into test values(" + id + ",'" + name+ "')";
			stmt.execute(sql);
			record = bin.readLine();
		}
		System.out.println("done");
		
	}
}
