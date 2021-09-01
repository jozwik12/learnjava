package examples.jcf.hw.onlinestore.withlist.menu.impl;

import java.util.List;

import examples.jcf.hw.onlinestore.withlist.configs.ApplicationContext;
import examples.jcf.hw.onlinestore.withlist.enteties.User;
import examples.jcf.hw.onlinestore.withlist.menu.Menu;
import examples.jcf.hw.onlinestore.withlist.services.UserManagementService;
import examples.jcf.hw.onlinestore.withlist.services.impl.DefaultUserManagementService;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		List<User> users = userManagementService.getUsers();
		
		if (users == null || users.size() == 0) {
			System.out.println("Unfortunately, there are no customers.");
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** USERS *****");		
	}

}
