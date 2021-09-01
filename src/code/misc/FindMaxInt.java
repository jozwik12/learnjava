package code.misc;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String userInput = sc.nextLine();
		int[] intArray = convertStringToInt(userInput.split("[\\s]+"));
		int maxInt = findMaxIntArray(intArray);
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	public static int findMaxIntArray(int[] intArray) {
		int max = intArray[0]; 
		for (int i : intArray) {
			if (i>max){
				max=i;
			}
		}
		return max;
	}
	
	private static int[] convertStringToInt (String[] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int i=0; i<stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
//			System.out.println(stringArray.length);
		}
		return intArray;
		
	}
}

