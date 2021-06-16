package com.javaudemy.misc;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter matrix size: ");
		int size = sc.nextInt();
		double[][] matrix = generateMatrix(size);
		
		
		System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = sc.nextInt();
		
		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();
		
		
//		if (rotateMatrix(matrix, mode)) {
//			printMatrixToConsole(matrix);
//		}
		switch(mode) {
		case 1:
			rotate90(matrix);
			break;
		case 2:
			rotate180(matrix);
			break;
		case 3:
			rotate270(matrix);
			break;
//		default:
//			System.out.println("Zjebales");
//			break;
		}
	}
	
	public static double[][] generateMatrix(int sizeMatrix) {
		double[][] matryca = new double[sizeMatrix][sizeMatrix];
		for (int i=0; i<sizeMatrix; i++) {
			for (int j=0; j<sizeMatrix; j++) {
				matryca[i][j] = i + 0.1*j;
			}
		}
		return matryca;
	}
	
	public static void printMatrixToConsole(double[][] matryca) {
		for (int i=0; i<matryca.length; i++) {
			for (int j=0; j<matryca.length; j++) {
				System.out.print(matryca[i][j] + "\s");
			}
			System.out.println();
		}
	}
	
	public static void rotate90(double[][] matryca) {
		int wym = matryca.length;
		double[][] obrMatryca = new double [wym][wym];
		for (int i=0; i<wym; i++) {
			for (int j=0; j<wym; j++) {
				obrMatryca[i][j] = matryca[i][wym-j-1];
			}
		}
		printMatrixToConsole(obrMatryca);
	}

	public static void rotate180(double[][] matryca) {
		int wym = matryca.length;
		double[][] obrMatryca = new double [wym][wym];
		for (int i=0; i<wym; i++) {
			for (int j=0; j<wym; j++) {
				obrMatryca[i][j] = matryca[wym-i-1][wym-j-1];
			}
		}
		printMatrixToConsole(obrMatryca);
	}

	public static void rotate270(double[][] matryca) {
		int wym = matryca.length;
		double[][] obrMatryca = new double [wym][wym];
		for (int i=0; i<wym; i++) {
			for (int j=0; j<wym; j++) {
				obrMatryca[i][j] = matryca[wym-i-1][j];
			}
		}
		printMatrixToConsole(obrMatryca);
	}

}
