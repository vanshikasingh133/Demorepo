package com.string;

//5.  Write a Java program to concatenate two strings.
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = sc.nextLine();
		String result = str1.concat(str2);
		System.out.println("Conactenated String: " + result);
	}

}
