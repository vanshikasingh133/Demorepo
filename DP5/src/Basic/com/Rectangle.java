package Basic.com;

public class Rectangle {
	public static void main(String[] args) {
		double width = 5.6;
		double height = 8.5;

		double perimeter = 2 * (height + width);
		double area = width * height;

		System.out.println("Area is = " + area);
		System.out.println("Perimeter is = " + perimeter);
	}
}