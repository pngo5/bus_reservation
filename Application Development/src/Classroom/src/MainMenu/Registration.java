package Classroom.src.MainMenu;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * @author abdulhakimdarman and phat
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

	/****
	 * 
	 * 
	   Creating a Method to check for valid password
	   -Less than 20 characters, no less than 4 *
	   -Must have a special characters *
	   -Must have a number*
	   -Must have a Upper-case letter*
	   -Must not have space*
	   
	 * 
	 * 
	 */
	public static  boolean lengthPasswordCheck(String newPassword) {
		if ( newPassword.length() < 20 && newPassword.length()>=4) {  
		  return true;	
		} 
		else {		
		return false;
      	}
	}
	/*****
	 * 
	 * 
	 Using the pack java Regex API ;
	 Pattern.compile and matcher;
	 *
	 I created a pattern instance, this is to see if the String
	 newPassword have any special characters.
	 *
	 Pattern.matcher see if any of the pattern instance match the String.
	 *
	 (http://tutorials.jenkov.com/java-regex/pattern.html#pattern-matches)
	 * @param newPassword
	 * @return
	 */
	public static boolean  hasSpecialCharacter(String newPassword) {
		Pattern special = Pattern.compile ("[^a-zA-Z]");
		Matcher hasSpecial = special.matcher(newPassword);
		return hasSpecial.find();		
	}
	/**
	 * 
	 Making a a Pattern instance for uppercase letters.
	 Using matcher hasUpper to check if there's any uppercase letter in
	 newPassword.
	 Using hasUpper.find() to see if there is an Uppercase letter in the string
	 if there is return true, if not return false
	 * 
	 * **/
	 public static boolean hasUpperCase(String newPassword) {
		 Pattern upperCase = Pattern.compile("[A-Z]");
		 Matcher hasUpper = upperCase.matcher(newPassword);
		 return hasUpper.find();	 
	 }
	 
	 /***
	  * 
	  This method check to see if this string have a digit
	  * @param newPassword
	  * @return
	  */
	 public static boolean hasDigit(String newPassword) {
		 Pattern digit = Pattern.compile("[0-9]");
		 Matcher hasDigit = digit.matcher(newPassword);
		 return hasDigit.find();		 
	 }
	 
	 /**
	  * Checking if there's space in the String 
	  *
	  * @param newPassword
	  * @return
	  */
	 public static boolean hasSpace(String newPassword) {
		  Pattern space = Pattern.compile("[ ]");
		  Matcher hasSpace = space.matcher(newPassword);
		  return hasSpace.find();
	 }
	
	
	
}
