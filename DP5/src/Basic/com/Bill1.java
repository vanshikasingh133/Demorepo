package Basic.com;
import java.util.Scanner;
public class Bill1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no of pizzas bought: ");
		int pizzas = input.nextInt();

		System.out.print("Enter the no of puffs bought: ");
		int puffs = input.nextInt();

		System.out.print("Enter the no of cold drinks bought: ");
		int drinks = input.nextInt();

		int total = (pizzas * 100)+(puffs * 20)+(drinks * 10);

		System.out.println("Total price= "+total);
		System.out.println("ENJOY THE SHOW");
	}
}