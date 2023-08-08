package Basic.com;

public class PercentageCalculator {
	public static void main(String[] args) {
		float english = 80, physics = 70, chemistry = 90, maths = 85, computer = 75;
		double total, average, percentage;

		total = english + physics + chemistry + maths + computer;
		average = total / 5;
		percentage = (average / 500) * 100;
		System.out.println("Total marks = " + total);
		System.out.println("Average marks = " + average);
		System.out.println("Percentage = " + percentage + "%");
	}
}