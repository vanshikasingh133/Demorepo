package com.string;

//3. 3. Compare string using new operator when new is present see different reference is there
public class Assignment3 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1 == str2);

	}
}