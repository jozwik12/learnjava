package examples.oop.exam.templates.onlineshop.services;

import examples.oop.exam.onlineshop.enteties.User;

public interface UserManagementService {

	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}
