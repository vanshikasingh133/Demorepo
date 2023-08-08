package arraylab.model;

import java.util.Scanner;

import arraylab.model.Books;

public class BookTest {
	public static void main(String[] args) {
		Books str[]=new Books[3];
		int i,len=str.length;
		System.out.println("Enter Data for books array");
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < len; i++) {

			Books stuarr[];
			stuarr=new Books[5];
			System.out.println(stuarr[0]);
			System.out.println(stuarr[1]);

			
			
		}
		
		System.out.println("----Display----");
		
		for(Books s:str) {
			System.out.println(s);
		}
	    }
        }