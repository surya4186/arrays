package ZSGS;

import java.util.Arrays;

public class Array {
	public static void rearrange(int[] arr) {
		int i=0;
		int j=arr.length-1;
		int[] result=new int[arr.length];
		boolean check=false;
		int n=j;
		if(result.length%2==0) {
			check=true;
		}
		while(i<=j) {
			if(check) {
				result[n--]=arr[j];
				j--;
			}else {
				result[n--]=arr[i];
				i++;
			}
			check=!check;
		}
		for(int k:result) {
			System.out.print(k+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,1,4,5,6,8,8};
		Arrays.sort(arr);
		rearrange(arr);

	}

}
