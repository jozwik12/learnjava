package examples.oop.exam.onlineshop;

import examples.oop.exam.onlineshop.menu.Menu;
import examples.oop.exam.onlineshop.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}
