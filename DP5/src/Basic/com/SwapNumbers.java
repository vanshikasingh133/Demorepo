package Basic.com;

public class SwapNumbers {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int temp;

		System.out.println("Before swapping: x = " + x + ", y = " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After swapping: x = " + x + ", y = " + y);
	}

}