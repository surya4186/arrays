package ZSGS;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiply {
	private static void matrixMultiply(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[matrix2.length][matrix2[0].length];
		int sum = 0;
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				for (int k = 0; k < matrix2.length; k++) {
					sum += matrix1[i][k] * matrix2[k][j];
					result[i][j] = sum;
				}
				sum = 0;
			}
		}
		printMatrix(result);
	}

	private static void printMatrix(int[][] result) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrix1 = new int[2][2];
		int[][] matrix2 = new int[2][3];
		System.out.println("Matrix1 row size");
		int r1 = scan.nextInt();
		System.out.println("Matrix1 column size");
		int c1 = scan.nextInt();

		System.out.println("Enter matrix1");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}
		System.out.println("Matrix2 row size");
		int r2 = scan.nextInt();
		System.out.println("Matrix2 column size");
		int c2 = scan.nextInt();

		System.out.println("Enter matrix2");

		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				matrix2[i][j] = scan.nextInt();
			}
		}

		matrixMultiply(matrix1, matrix2);

	}

}
