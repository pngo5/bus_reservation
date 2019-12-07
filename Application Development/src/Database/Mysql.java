package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class Mysql {
	public static void main(String[] args) throws Exception {
		getConnection();
		 get();
	}
	
	public static ArrayList<String> get() {
		
		try {
			Connection conn = getConnection();
			
			PreparedStatement statement = conn.prepareStatement("SELECT user_id, password, first_name, last_name, address, zip, state, email, ssn, question, answer, admin  FROM users");
			
			ResultSet result = statement.executeQuery(); 
			
			ArrayList<String> array = new ArrayList<String>();
			
			while(result.next()) {
				System.out.println(result.getString("first_name"));
				System.out.println(" ");
				System.out.println(result.getString("last_name"));
				
				
				array.add(result.getString("first_name"));
			}
			System.out.println("All records have been selected");
			
			return array;
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	
	
	
	public static void post() throws Exception {
		final String user = "adarman1";
		final String password = "cis3270";
		final String var1 = "Abdulhakim";
		final String var2 = "Darman";
		final String addy = "1101 Main Street";
		final int zip = 10111;
		final String state = "GA";
		final String email = "123Fakeemail@gmial.com";
		final String ssn = "343434";
		final String question = "Are you addicted to chickfila";
		final String answer = "Yes";
		final int admin = 1;
		
		
		try {
		Connection conn = getConnection();
		PreparedStatement posted = conn.prepareStatement("INSERT INTO users  (user_id, password, first_name, last_name, address, zip, state, email, ssn, question, answer, admin) VALUES('"+user+"','"+password+"','"+var1+"', '"+var2+"' , '"+addy+"' , '"+zip+"' , '"+state+"','"+email+"','"+ssn+"', '"+question+"' , '"+answer+"' , '"+admin+"')");
		posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Insert Completed");
		}
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
