package examples.jcf.hw.onlinestore.withlist;

import examples.jcf.hw.onlinestore.withlist.menu.Menu;
import examples.jcf.hw.onlinestore.withlist.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}
