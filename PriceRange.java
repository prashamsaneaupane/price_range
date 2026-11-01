
import java.util.Scanner;

public class PriceRange {

	static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args){
		System.out.print("How many prices do you have? ");
		int count = kbd.nextInt();

		double[] prices = new double[count];

		for (int i = 0; i < prices.length; i++) {
			System.out.print("Enter price " + (i + 1) + ": ");
			prices[i] = kbd.nextDouble();
		}

		System.out.println();
		System.out.println("Price Range");
		System.out.println("------------");
		for (int i = 0; i < prices.length; i++) {
			System.out.printf("Price %d: $%.2f%n", i + 1, prices[i]);
		}

		double max = Double.NEGATIVE_INFINITY;
		double min = Double. POSITIVE_INFINITY;
		for (int i = 0; i < prices.length; i++) {
			max = Math.max(max, prices[i]);
			min = Math.min(min, prices[i]);
		}

		System.out.printf("Highest: $%.2f%n", max);
		System.out.printf("Lowest: $%.2f%n", min);

	}
}
