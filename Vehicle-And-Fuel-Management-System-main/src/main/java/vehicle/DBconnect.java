package vehicle;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect{
	
	public static String url = "jdbc:mysql://localhost:3306/oop";
	public static String user = "root";
	public static String password = "Aa12345678";
	public static Connection con;

	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, password);
			
		}
		catch (Exception e) {
			System.out.println("Database connection is not success!!!");
		}
		
		return con;
	}
}
