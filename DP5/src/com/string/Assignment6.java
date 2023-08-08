package com.string;

//6. Write a Java program to compare two strings
import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = sc.nextLine();
		if (str1 == str2) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

	}

}
