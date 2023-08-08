package com.string;

//7. Write a Java program to convert lowercase string to uppercase.
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a lowercase string:");
		String str = sc.nextLine();
		String upperStr = str.toUpperCase();
		System.out.println("Uppercase string: " + upperStr);
		sc.close();
	}
}
