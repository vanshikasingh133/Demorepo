package com.array2D;

public class MinimumChar {
	 public static void main(String[] args) {
	        char[] arr = {'A', 'a', 'E', 'x', 'z', 'R'};
	        char minChar = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < minChar) {
	                minChar = arr[i];
	            }
	        }
	        System.out.println("Minimum character: " + minChar);
	    }
	}
