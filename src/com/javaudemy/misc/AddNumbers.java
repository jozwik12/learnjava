package com.javaudemy.misc;

public class AddNumbers {

	public static void main(String[] args) {
		System.out.println("Sumator dwoch liczb");
		if (args[0].contains(".") || args[1].contains(".")) {
			System.out.println(Double.parseDouble(args[0]) + Double.parseDouble(args[1]));
		} else {
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		}
	}

}


