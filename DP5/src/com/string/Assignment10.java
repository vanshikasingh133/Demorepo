package com.string;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		int index = str.indexOf(ch);
		if (index == -1) {
			System.out.println("Charactor not found.");
		} else {
			System.out.println("The first occurrence of " + ch + " is at index " + index);
		}

	}

}
