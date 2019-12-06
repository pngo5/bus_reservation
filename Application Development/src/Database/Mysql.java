package Database;
import java.sql.Connection;
import java.sql.DriverManager;
public class Mysql {
	public static void main(String[] args) throws Exception {
		getConnection();
		 
	}
	
	
	
	public static Connection getConnection() throws Exception  {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://34.74.172.98:3306/eastern-moment-259921:us-east1:cis3270-server";
			String username = "root";
			String password = "cis3270";
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			return conn;
		}catch(Exception e) {System.out.println(e);}
		
		return null;
	}

}
