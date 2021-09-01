package examples.finaltask.services;

import java.util.List;

import examples.finaltask.enteties.User;

public interface UserManagementService {

	String registerUser(User user);
	
	List<User> getUsers();

	User getUserByEmail(String userEmail);

}
