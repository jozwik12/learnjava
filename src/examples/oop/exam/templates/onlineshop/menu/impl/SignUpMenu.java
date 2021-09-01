package examples.oop.exam.templates.onlineshop.menu.impl;

import examples.oop.exam.onlineshop.configs.ApplicationContext;
import examples.oop.exam.onlineshop.menu.Menu;
import examples.oop.exam.onlineshop.services.UserManagementService;
import examples.oop.exam.onlineshop.services.impl.DefaultUserManagementService;

public class SignUpMenu implements Menu {

	private UserManagementService userManagementService;
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>	
	}

}
