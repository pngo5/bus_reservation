package Objects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author abdulhakimdarman and phat
 * 
 *         This will be for new users
 *
 */

public class User {
	/**
	 * Registration requires information such as first name, last name, address,
	 * zip, state, username, password, email, SSN and a security question for
	 * password recov
	 */
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String zip;
	private String state;
	private String email;
	private String ssn;
	private String secQuestions;
	private String secAnswers;
	private short isAdmin;
	
	//


	public User(String userName, String password, String firstName, String lastName, String address, String zip,
			String state, String email, String ssn, String secQuestions, String secAnswers) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.zip = zip;
		this.state = state;
		this.email = email;
		this.ssn = ssn;
		this.secQuestions = secQuestions;
		this.secAnswers = secAnswers;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
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



	public String getSecQuestions() {
		return secQuestions;
	}



	public void setSecQuestions(String secQuestions) {
		this.secQuestions = secQuestions;
	}



	public String getSecAnswers() {
		return secAnswers;
	}



	public void setSecAnswers(String secAnswers) {
		this.secAnswers = secAnswers;
	}



	public short getIsAdmin() {
		return isAdmin;
	}



	public void setIsAdmin(short isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
