package javaPrograms;

import java.util.Scanner;

public class leapyears {

	private static void leapyear(int year) {
		boolean isleapyr = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isleapyr = true;
				} else {
					isleapyr = false;
				}
			}else {
				isleapyr = true;
			}
		} else {
			isleapyr = false;
		}

		if (isleapyr) {
			System.out.println("The Year is Leap year " + year);
		} else {
			System.out.println("The Year is not Leap year " + year);
		}
	}

	public static void main(String[] args) {

		int year;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		year = scan.nextInt();
		leapyear(year);
	}
}
