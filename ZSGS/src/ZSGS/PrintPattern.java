package ZSGS;

import java.util.Scanner;

public class PrintPattern {
	public static void printPattern(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(i==j || str.length()-1==i+j) {
					System.out.print(str.charAt(j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word");
		String str=scan.next();
		printPattern(str);
		

	}

}
