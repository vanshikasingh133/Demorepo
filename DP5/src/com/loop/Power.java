package com.loop;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number: ");
		int base = sc.nextInt();
		System.out.println("Enter the exponant number: ");
		int expo = sc.nextInt();
		int power = 1;
		for (int i = 1; i <= expo; i++) {
			power = power * base;
		}
		System.out.println("The number is: " + power);
	}
	
}