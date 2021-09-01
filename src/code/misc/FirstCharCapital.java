package code.misc;

import java.util.Arrays;
import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String string) {
		String[] tablica = string.split("[\\p{Punct}\\s]+");
		String output = "";
		for (int i=0; i<tablica.length; i++) {
			char pocz = tablica[i].charAt(0);
			String duzyPocz = Character.toString(pocz);
			tablica[i]=tablica[i].toLowerCase();
			tablica[i] = duzyPocz.toUpperCase() + tablica[i].substring(1);
			output = output.concat(tablica[i]) + " ";
		}
		return output;
	}
}
