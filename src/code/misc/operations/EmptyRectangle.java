package code.misc.operations;

import java.util.Scanner;

public class EmptyRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle (height, width);
	}
	
	public static void drawRectangle (int height, int wys) {
		for (int i=0; i<wys; i++) {
			for (int j=0; j<height; j++) {
				if (j==0 || j==height-1) {
					System.out.print("*");
				} else if (i==0 || i==wys-1){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
