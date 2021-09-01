package code.misc;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please, enter length of initial array: ");
		int baseArrayLenght = in.nextInt();
		int[] arr = generateRandomArray(baseArrayLenght);
		int[] extArr = extendArray(arr);
		System.out.println("*** Initial array ***");
		System.out.println(Arrays.toString(arr));
		System.out.println("*** Extended array ***");
		System.out.println(Arrays.toString(extArr));
	}
	
	public static int[] generateRandomArray(int lenght) {
		Random rand = new Random();
		int[] arr = new int[lenght];
		for (int i=0; i<lenght; i++) {
			arr[i] = rand.nextInt();
		}
		return arr;
	}
	
	public static int[] extendArray(int[] tablica) {
		int[] extArr = new int[tablica.length*2];
		for (int i=0; i<extArr.length; i++) {
			if (i<=tablica.length-1) {
				extArr[i] = tablica[i];
			} else {
				extArr[i] = 2*tablica[i-tablica.length];
			}			
		}
		return extArr;
	}

}
