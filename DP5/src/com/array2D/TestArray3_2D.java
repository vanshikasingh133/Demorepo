package com.array2D;

import java.util.Scanner;

public class TestArray3_2D {

	public static void main(String[] args) {
		int tab[][] = new int[3][3];
		int i, j, rows, cols;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		rows = sc.nextInt();
		System.out.println("Enter the no. of cols: ");
		cols = sc.nextInt();

		System.out.println("Enter elements in 2D array\n");

		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				System.out.println("Enter Element for tab[" + i + "][" + j + "]");
				tab[i][j] = sc.nextInt();
				
                System.out.println("------2D Array-----");
				for (i = 0; i < rows; i++) {
					for (j = 0; j < cols; j++) {
						System.out.println(tab[i][j] + "\t");
					}
					System.out.println();
				}

			}
		}
	}
}
