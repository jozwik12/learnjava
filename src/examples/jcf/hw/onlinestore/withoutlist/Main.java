package examples.jcf.hw.onlinestore.withoutlist;

import examples.jcf.hw.onlinestore.withoutlist.menu.Menu;
import examples.jcf.hw.onlinestore.withoutlist.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}
