package ZSGS;

import java.util.Scanner;

public class MatrixSearch {
	private static int findGrandchild(String child ,String[][] str) {
		int count=0;
		for(int i=0;i<str.length;i++) {
			if(str[i][1].equals(child)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[][] str=new String[4][2];
		int count=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length;j++) {
				str[i][j]=scan.next();
				
			}
		}
//		for(int i=0;i<str.length;i++) {
//			for(int j=0;j<str[i].length;j++) {
//				System.out.println(str[i][j]);
//				
//			}
//		}
//		String[][] str= {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		System.out.println("Enter the father Name");
		String fatherName=scan.next();
		
		for(int i=0;i<4;i++) {
			if(str[i][1].equals(fatherName)) {
				count+=findGrandchild(str[i][0],str);
			}
		}
		System.out.println(count);

	}

}
