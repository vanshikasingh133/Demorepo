package Basic.com;
import java.util.Scanner;
public class SquareNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length: ");
		int length = input.nextInt();

		System.out.print("Enter the breadth: ");
		int breadth = input.nextInt();

		if (length == breadth) {
			System.out.println("It is a square.");
		} else {
			System.out.println("It is a rectangle.");
		}
	}
}