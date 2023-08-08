package com.loop;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0)
		{
			System.out.println("Entered number is a prime number.");
		} else {
			System.out.println("Entered number is not a prime number."
					+ "");
		}
		sc.close();

	}
}
