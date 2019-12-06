package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Mysql {
	public static void main(String[] args) throws Exception {
		getConnection();
		 
	}
	
	
	
	public static Connection getConnection() throws Exception  {
		try {
			String url = "jdbc:mysql://34.74.172.98/bus_database";
			String username = "root";
			String password = "cis3270";
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection successful");
			
			Statement statement = conn.createStatement();
			ResultSet rst = statement.executeQuery("select user from mysql.user;");
			
			while (rst.next()) {
				System.out.println(rst.getString(1));
			}
			
			return conn;
		}catch(Exception e) {System.out.println(e);}
		
		return null;
	}

}
