package com.string;
//2. Compare string using == when “” is present see same reference is there.
public class Assignment2 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");
		System.out.println(str1==str2);
		System.out.println(str1==str3);

	}

}
