package Main;
/**
 * 
 * @author abdulhakimdarman
 * 
 * This will be for new users
 *
 */

public class Registration {
	/**
	 * Registration requires information such as first name, last name, address, zip, state, username, password, email, SSN and a security question for password recov
	 */
	private String newUserName;
	private String newPassword;
	private String firstName;
	private String lastName;
	private String zip;
	private String state;
	private String secQ;
	private String email;
	private String ssn;
	public String getNewUserName() {
		return newUserName;
	}
	public void setNewUserName(String newUserName) {
		this.newUserName = newUserName;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSecQ() {
		return secQ;
	}
	public void setSecQ(String secQ) {
		this.secQ = secQ;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
