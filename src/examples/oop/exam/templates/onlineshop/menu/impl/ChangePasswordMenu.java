package examples.oop.exam.templates.onlineshop.menu.impl;

import examples.oop.exam.onlineshop.configs.ApplicationContext;
import examples.oop.exam.onlineshop.menu.Menu;

public class ChangePasswordMenu implements Menu {
	
	private ApplicationContext context;
	
	{
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
