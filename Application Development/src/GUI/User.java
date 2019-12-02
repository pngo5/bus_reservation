package GUI;
/**
 * 
 * @author abdulhakimdarman
 *
 * Parent Class to Admin
 */
public abstract class User {
	
	private String username;
	private String password;
	
	public User() {
		
	}
	// TODO Figure out how to create a new user to the database.
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	//TODO Have an authentication proccess for the username and password.
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
/**** Hello***/ 

}
