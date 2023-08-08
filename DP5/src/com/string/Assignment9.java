package com.string;
//9. WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class Assignment9 {

	public static void main(String[] args) {
		String str = "HELLO$WORLD";
        String[] sp = str.split("\\$");
        System.out.println("First split string: " + sp[0]);
        System.out.println("Second split string: " + sp[1]);

	}

}
