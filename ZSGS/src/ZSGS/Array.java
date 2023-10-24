package ZSGS;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void rearrange(int[] array) {
		int i = 0;
		int j = array.length - 1;
		int[] result = new int[array.length];
		boolean check = false;
		int n = j;
		if (result.length % 2 == 0) {
			check = true;
		}
		while (i <= j) {
			if (check) {
				result[n--] = array[j];
				j--;
			} else {
				result[n--] = array[i];
				i++;
			}
			check = !check;
		}
		for (int k : result) {
			System.out.print(k + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = scan.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {                   //Selection sort
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int tem = array[i];
			array[i] = array[minIndex];
			array[minIndex] = tem;
		}
		rearrange(array);                                //Method call

	}

}
