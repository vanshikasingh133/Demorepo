package Basic.com;

import java.util.Scanner;

public class Bill {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity of purchased units: ");
        int quantity = sc.nextInt();
        int cost = quantity * 100;
        if (cost > 1000) 
        {
            cost *= 0.9;
        }
        System.out.println("Total cost: " + cost);
    }
}
