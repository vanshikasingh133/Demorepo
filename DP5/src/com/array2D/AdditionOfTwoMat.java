package com.array2D;
import java.util.Scanner;
public class AdditionOfTwoMat {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter the number of cols: ");
		int cols=sc.nextInt();
		
		int mat1[][]=new int[rows][cols];
		int mat2[][]=new int[rows][cols];
		int resultmat[][]=new int[rows][cols];
		
		System.out.println("Enter the element for mat1: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the element for mat2: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				resultmat[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
	}

}