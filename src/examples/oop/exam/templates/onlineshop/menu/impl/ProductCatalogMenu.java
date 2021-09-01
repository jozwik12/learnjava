package examples.oop.exam.templates.onlineshop.menu.impl;

import examples.oop.exam.onlineshop.configs.ApplicationContext;
import examples.oop.exam.onlineshop.menu.Menu;
import examples.oop.exam.onlineshop.services.ProductManagementService;
import examples.oop.exam.onlineshop.services.impl.DefaultProductManagementService;

public class ProductCatalogMenu implements Menu {

	private static final String CHECKOUT_COMMAND = "checkout";
	private ApplicationContext context;
	private ProductManagementService productManagementService;

	{
		context = ApplicationContext.getInstance();
		productManagementService = DefaultProductManagementService.getInstance();
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
