package code.misc.operations;

import java.util.Scanner;

public class CircleCircumference {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");
		double r = sc.nextDouble();
		double circleCircumference = Math.PI*r*r;
		System.out.println("Circle circumference is: " + circleCircumference);
	}
    
}
