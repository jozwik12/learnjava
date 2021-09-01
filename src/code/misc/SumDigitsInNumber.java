package code.misc;

import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		String liczba = Integer.toString(number);
		String[] tablica = liczba.split("");
		int suma=0;
		for (String iterator : tablica) {
			suma += Integer.parseInt(iterator);
		}
		
		
		return suma;
	}
}