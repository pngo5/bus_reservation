package BusinessLogic;

import Objects.Registration;

public interface RegisteringNewUser {
	
	public abstract void createUserToDataBase(Registration user);
	
	public abstract void addUserToDataBase(Registration user);

}
