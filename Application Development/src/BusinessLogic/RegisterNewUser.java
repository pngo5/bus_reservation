package BusinessLogic;

import Objects.User;
import Database.Mysql;

public class RegisterNewUser implements RegisteringNewUser {
	
	@Override
	public void addUserToDataBase(User user) throws Exception {
		Mysql.post(user);
	}

}
