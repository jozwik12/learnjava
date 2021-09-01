package code.misc;

import java.util.Scanner;

public class NewLineForDigit {
    
    public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		int lenghtOfInput = userInput.length();
		for (int i=0; i<lenghtOfInput; i++) {
			System.out.println(userInput.substring(i, i+1));
		}
		
    }
   
}