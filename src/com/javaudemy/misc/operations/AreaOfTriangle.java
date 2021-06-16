package com.javaudemy.misc.operations;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter A side of a triangle: ");
		float a = sc.nextFloat();
		System.out.print("Please, enter B side of a triangle: ");
		float b = sc.nextFloat();
		System.out.print("Please, enter C side of a triangle: ");
		float c = sc.nextFloat();
		
		if (a+b>c && a+c>b && b+c>a) {
			double triangleArea = Math.sqrt((0.5*(a+b+c))*(0.5*(-a+b+c))*(0.5*(a-b+c))*(0.5*(a+b-c)));
			System.out.println("Triangle area is: " + triangleArea);
		} else {
			System.out.println("NaN");
		}
		

	}

}
