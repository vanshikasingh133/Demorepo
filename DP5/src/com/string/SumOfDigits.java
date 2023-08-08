package com.string;
//vanshika 123=6
public class SumOfDigits {
	public static void main(String[] args) {
		 String s = "vanshika 123";
	        int sum = 0;

	        for (int i = 0; i < s.length(); i++) {
	            char temp = s.charAt(i);
	            if (Character.isDigit(temp)) {
	                int num = Integer.parseInt(String.valueOf(temp));
	                sum += num;
	            }
	        }

	        System.out.println("Sum of numbers in the string is: " + sum);
	    }
}

	