package code.misc;

import java.util.Scanner;

public class AdminGuestMode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String admin = "--admin";
		String user = "--user";
		System.out.print("Wybierz tryb admin/user");
		String input = scan.next();
		if (input.contains(user) && input.contains(admin)) {
			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		} else if (input.contains(admin)) {
			System.out.println("Hello, Admin!");
		} else if (input.contains(user)) {
			System.out.println("Hello, User!");
		} else {
			System.out.println("Pierdol sie");
		}
	}

}
