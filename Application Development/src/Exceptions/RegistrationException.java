package Exceptions;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationException {
	
	



	/****
	 * 
	 * 
	 * Creating a Method to check for valid password -Less than 20 characters, no
	 * less than 4 * -Must have a special characters * -Must have a number* -Must
	 * have a Upper-case letter* -Must not have space*
	 * 
	 * 
	 * 
	 */
	public static boolean lengthPasswordCheck(String newPassword) {
		if (newPassword.length() < 20 && newPassword.length() >= 4) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * validating that the username is less than 15 characters . 
	 * Must better 4 characters.
	 * 
	 * */
	
	
	public static boolean lengthUsernameCheck(String newUsername) {
		if (newUsername.length() < 15 && newUsername.length() >= 4) {
			return true;
		} else {
			return false;
		}
	}

	/*****
	 * 
	 * 
	 * Using the pack java Regex API ; Pattern.compile and matcher;
	 *
	 * I created a pattern instance, this is to see if the String newPassword have
	 * any special characters.
	 *
	 * Pattern.matcher see if any of the pattern instance match the String.
	 *
	 * (http://tutorials.jenkov.com/java-regex/pattern.html#pattern-matches)
	 * 
	 * @param newPassword
	 * @return
	 */
	public static boolean hasSpecialCharacter(String newPassword) {
		Pattern special = Pattern.compile("[^a-zA-Z]");
		Matcher hasSpecial = special.matcher(newPassword);
		return hasSpecial.find();
	}

	/**
	 * 
	 * Making a a Pattern instance for uppercase letters. Using matcher hasUpper to
	 * check if there's any uppercase letter in newPassword. Using hasUpper.find()
	 * to see if there is an Uppercase letter in the string if there is return true,
	 * if not return false
	 * 
	 **/
	public static boolean hasUpperCase(String newPassword) {
		Pattern upperCase = Pattern.compile("[A-Z]");
		Matcher hasUpper = upperCase.matcher(newPassword);
		return hasUpper.find();
	}

	/***
	 * 
	 * This method check to see if this string have a digit
	 * 
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

	/**
	 * Matching any string with 3 number that's not 000 or 666 ^(?!000|666). ?! is a
	 * negative lookahead meaning, there must not be 000 or 666 for the string to
	 * match.
	 * 
	 * [0-8] - There must be 8 digits for this to match the string.
	 * 
	 * [0-9]{2} - The string must match two digits exactly between 0-9 for it to be
	 * a match. The - is the code allow spacing, like how actually SNN have it.
	 *
	 * (?!00)[0-9]{2} For the string to match this part, it must not contain 00, but
	 * it must match two digit from 0-9.
	 *
	 * the dash - is so we're following snn format.
	 *
	 * (?!0000) negative lookahead stating that there must not be 0000 for the
	 * string to be a match
	 *
	 * [0-9]{4} is to make sure the string has number between 0-9, and it also have
	 * to be exactly 4 numbers
	 *
	 */

	public static boolean hasCorrectSnn(String newPassword) {
		Pattern snn = Pattern.compile("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$");
		Matcher hasCorrectSnn = snn.matcher(newPassword);
		return hasCorrectSnn.find();
	}
	 /**
	  
	4 parts to emails
	1 any letters, dots and hypens
	2 any letters, numbers and / or hypens
	3 any letters
	4 . then any letters
	 -----------------------------------------
	 [A-Z0-9._%+-]  Allow any letter or number to be enter, and also it does not have a limit of how many character. 
	 *
	 +@ is telling you that the string must have an @
	 *
	 [A-Z0-9.-]+\\. the characters after the @ can be any amount of letters, and this also adding the dot after those letters
	 *
	 [A-Z]{2,6} This code is telling you that after the dot there any letters from A-Z, but its can not be more than 6 and also cannot be less that 2. 
	 *
	 A new code that I'll like to add is pattern.case_insensitive, this allow  matching characters in the US-ASCII.
	  * 
	  */
	 
	public static boolean emailValid(String newEmail) {
		Pattern email = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
		Matcher emailValid = email.matcher(newEmail);
		return emailValid.find();
		
	}



}
