package Basic.com;

import java.util.Scanner;

public class Movie {
	String name;
	String moviename;
	int price;
	int couponcode;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=input.next();
		System.out.println("Enter the movie name: ");
		String moviename=input.next();
		System.out.println("Enter price: ");
		int price=input.nextInt();
		System.out.println("Enter the coupon code: ");
		int couponcode=input.nextInt();
		
		if(couponcode==100) {
			System.out.println("You will get 10% Discount ");
		}
		else if (couponcode==200) {
			System.out.println("You will get 20% Discount ");
		}
		else {
			System.out.println("No Discount");
		}
	}
}