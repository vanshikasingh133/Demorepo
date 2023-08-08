package com.array;

import java.util.Arrays;

public class Replace0 {
	public static void main(String[] args) {
		int[] arr= {78, 2, 55, 0, 8, 42, 79, 0, 0, 69, 56};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
