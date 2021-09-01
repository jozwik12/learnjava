package examples.finaltask.storage;

import java.util.List;

import examples.finaltask.enteties.User;

public interface UserStoringService {
	
	void saveUser(User user);
	
	List<User> loadUsers();
	
}
