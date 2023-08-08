package com.array2D;

public class TestArray1_2D {
	public static void main(String[] Args) {
		int mat[][];
		mat = new int[3][3];
		int arr[][] = new int[2][2];
		int rows = 4;
		int cols = 3;
		int arr1[][] = new int[rows][cols];
		int i, j;
		System.out.println("-----Elements in 2d Array-----");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);

		arr[0][0] = 52;
		arr[0][1] = 34;
		arr[1][0] = 96;
		arr[1][1] = 25;

		System.out.println("-----Elements in 2d Array before insertion-----");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);

		System.out.println("-----Elements in 2d Array using for loops-----");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();

			System.out.println("-----Elements in 2d Array using for loops-----");
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					System.out.println("Elements at arr[" + i + "][" + j + "]=" + arr[i][j]);
				}
				System.out.println();
			}
		}
	}
}
