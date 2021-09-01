package examples.oop.exam.templates.onlineshop.menu.impl;

import examples.oop.exam.onlineshop.configs.ApplicationContext;
import examples.oop.exam.onlineshop.menu.Menu;
import examples.oop.exam.onlineshop.services.OrderManagementService;
import examples.oop.exam.onlineshop.services.impl.DefaultOrderManagementService;

public class CheckoutMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;
	
	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
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
