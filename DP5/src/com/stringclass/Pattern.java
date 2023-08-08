package com.stringclass;

public class Pattern {
	public static void main(String [] args) {
		String str="java";
		int len=str.length();
		for(int i=1;i<=len;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(str.charAt(j) + " ");
			}
			System.out.println();
		}
	}

}
