package com.javaudemy.misc;

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.println("Please, enter minumum word length to filter words: ");
		int minLenght = sc.nextInt();
		
		String[] words = userInput.split("[\\W]+");
		String[] filteredWords = filterWordsByLenght(minLenght, words);
		System.out.println(Arrays.toString(filteredWords));
	}
	
	public static String[] filterWordsByLenght(int minLenght, String[] words) {
		int i=0;
		for (String elem : words) {
			if (elem.length() >= minLenght) {
				i++;
			}
		}
		String[] filtered = new String[i];
		i=0;
		for (String elem : words) {
			if (elem.length() >= minLenght) {
				filtered[i] = elem;
				i++;
			}
		}
		return filtered;
	}

}
