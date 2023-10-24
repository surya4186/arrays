package ZSGS;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiply {
	private static void matrixMultiply(int[][] matrix1,int[][] matrix2) {
		int[][] result=new int[matrix2.length][matrix2[0].length];
		int sum=0;
		
		for(int i=0;i<matrix2.length;i++) {
			for(int j=0;j<matrix2.length;j++) {
				result[i][j]=0;
				for(int k=0;k<matrix2.length;k++) {
					sum+=matrix1[i][k]*matrix2[k][j];
					result[i][j]=sum;
				}
				sum=0;
				//System.out.println(Arrays.deepToString(result[i][j]));
				
			}
		}
	 System.out.println(Arrays.toString(result));
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		int [][] matrix1=new int[2][2];
//		int [][] matrix2=new int[3][3];
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<2;j++) {
//				matrix1[i][j]=scan.nextInt();
//			}
//		}
//		System.out.println("matrix2");
//		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				matrix2[i][j]=scan.nextInt();
//			}
//		}
		int [][]matrix1= {{1,2},{3,4}};
		int [][]matrix2= {{5,6,7},{8,9,10}};
		matrixMultiply(matrix1, matrix2);

	}

}
