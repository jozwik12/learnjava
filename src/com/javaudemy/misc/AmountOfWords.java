package com.javaudemy.misc;

import java.util.Arrays;
import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String text = sc.nextLine();
		String[] slowa = text.split("\\s+");
		int amountOfWords = getWordsAmount(slowa);
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	private static int getWordsAmount(String[] slowa) {
		int dupa = 0;
		for (String i : slowa) {
			dupa++;
//			System.out.println(i);
		}
//		System.out.println(Arrays.toString(slowa));
		return dupa;
	}
}
