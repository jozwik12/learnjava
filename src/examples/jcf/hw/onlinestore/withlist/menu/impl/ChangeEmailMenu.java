package examples.jcf.hw.onlinestore.withlist.menu.impl;

import java.util.Scanner;

import examples.jcf.hw.onlinestore.withlist.configs.ApplicationContext;
import examples.jcf.hw.onlinestore.withlist.menu.Menu;


public class ChangeEmailMenu implements Menu {

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		context.getLoggedInUser().setEmail(userInput);
		System.out.println("Your email has been successfully changed");
		new MainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** CHANGE EMAIL *****");
		System.out.print("Enter new email: ");
	}

}