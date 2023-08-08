package com.stringclass;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		String str=sc.nextLine();
		String reversenum=" ";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			reversenum +=str.charAt(i);
		}
		if(str.equals(reversenum)) {
			System.out.println(str + " is a palindrome number");
		}else {
			System.out.println(str + " is not a palindrome number");
		}
	}

}
