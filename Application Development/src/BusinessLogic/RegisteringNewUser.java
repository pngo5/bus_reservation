package BusinessLogic;

import Objects.User;

public interface RegisteringNewUser {
	
	public abstract void addUserToDataBase(User user) throws Exception;

}
