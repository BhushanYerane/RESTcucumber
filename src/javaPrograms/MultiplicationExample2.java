package javaPrograms;

import java.util.Scanner;

public class MultiplicationExample2 {

	public static void main(String[] args) {

		int product = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int multiplicand = scan.nextInt();
		System.out.print("Enter the second number: ");
		int multiplicator = scan.nextInt();

		for (int i = 0; i < multiplicator; i++) {
			product = sum(product, multiplicand);
		}
		System.out.print("product of " + multiplicand + " and " + multiplicator + " is: " + product);
	}

	static int sum(int multiplicand, int multiplicator) {
		for (int i = 0; i < multiplicator; i++)
			multiplicand++;
		return multiplicand;
	}
}
