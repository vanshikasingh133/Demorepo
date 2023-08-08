package com.string;
//8. 8. Write a Java program to copy one string to another string.

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str1 = sc.nextLine();
	        String str2 = str1;
	        System.out.println("Copied string: " + str2);
	 	}
	}