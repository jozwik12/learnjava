package code.misc;

import java.util.Scanner;

public class DemoEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check it priority: ");
			String userInput = sc.next();
			
			if (isValidMessageType(userInput)) {
				MessageType messageType = MessageType.valueOf(userInput.toUpperCase());
				System.out.println(messageType.getPriority());
				
				break;
			} else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
				
			}
		}
	}
	
	public static boolean isValidMessageType(String userInput) {
		return userInput.matches("^[abcdABCD]{1}$");
	}

}
