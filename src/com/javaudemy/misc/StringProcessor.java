package com.javaudemy.misc;

import java.util.Arrays;

public class StringProcessor {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";
	
	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));
		
		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));
		
	}
	
	public static String convert1(String input) {
		String[] tablica = input.split("[;\\r\\n]");
		String output="";
		for (int i=4; i<tablica.length; i=i+4) {
			output = output + tablica[i] + " ==> " + tablica[i+2] + "\n";
		}
		System.out.println(Arrays.deepToString(tablica));
		return output;
	}
	
	
	public static String convert2(String input) {
		String[] tablica = input.split("[;\\r\\n]");
		String output="";
		for (int i=5; i<tablica.length; i=i+4) {
			output = output + tablica[i] + " (email:" + tablica[i+1] + ")\n";
		}
		return output;
	}
}
