package Basic.com;

public class DistanceConverter {

	public static void main(String[] args) {
		double kilometers = 20.5;
		double meters = kilometers * 1000;
		double centimeters = kilometers * 100000;

		System.out.println(kilometers + " kilometers = " + meters + " meters");
		System.out.println(kilometers + " kilometers = " + centimeters + " centimeters");
	}
}