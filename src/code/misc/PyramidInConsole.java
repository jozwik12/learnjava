package code.misc;

import java.util.Scanner;

public class PyramidInConsole {

	public static void main(String[] args) {
		System.out.print("Please, enter height of the pytamid: ");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		for (int i=0; i<userInput; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=userInput; i>0; i--) {
			for (int j=0; j<i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
