package ZSGS;

import java.util.Scanner;

public class PerfectSquare {
	private static void findSumOfWeights(int[] array, int[][] result) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (checkPrefectSquare(array[i])) {
				count += 5;
			}
			if (array[i] % 4 == 0 && array[i] % 6 == 0) {
				count += 4;
			}
			if (array[i] % 2 == 0) {
				count += 3;
			}
			result[i][0] = array[i];
			result[i][1] = count;
			count = 0;
		}
		sortArray(result);

	}

	public static boolean checkPrefectSquare(int n) {

		for (int i = 0; i < n / 2 - 1; i++) {
			if (i * i == n) {
				return true;
			}
		}
		return false;
	}

	private static void sortArray(int[][] resultArray) {
		for (int i = 0; i < resultArray.length; i++) {
			int max = resultArray[i][1];
			int maxIndex = i;
			for (int j = i + 1; j < resultArray.length; j++) {
				if (max < resultArray[j][1]) {
					max = resultArray[j][1];
					maxIndex = j;
				}
			}
			int[] tem = resultArray[maxIndex];
			resultArray[maxIndex] = resultArray[i];
			resultArray[i] = tem;

		}
		printArray(resultArray);
	}

	public static void printArray(int[][] resultArray) {
		System.out.println("weight is descending order: ");
		for (int[] n : resultArray) {
			System.out.print("[");
			for (int i : n) {
				System.out.print(i + " ");
			}
			System.out.print("]");
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the array Size:");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] setOfNumber = new int[size];
		int[][] result = new int[size][2];
		System.out.println("Enter the Array");
		for (int i = 0; i < size; i++) {
			setOfNumber[i] = scan.nextInt();
		}
		System.out.print("set of numbers: ");
		for (int num : setOfNumber) {
			System.out.print(num + " ");
		}
		System.out.println();
		findSumOfWeights(setOfNumber, result);

	}

}
