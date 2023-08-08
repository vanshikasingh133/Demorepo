package com.array.lab;

import java.util.Arrays;

public class ReverseArr {
	public static void swapnum(int[]arr) {
		int lastIdx=arr.length-1;
		int lastIdxElement=arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
        	arr[lastIdx]=arr[i];
        	lastIdx--;
        	arr[i]=lastIdxElement;
        }
	System.out.print(Arrays.toString(arr));
	}
	public static void main(String[] args) {
        int[] arr = {3, 1, 7, 8};
        swapnum(arr);
                }
    }