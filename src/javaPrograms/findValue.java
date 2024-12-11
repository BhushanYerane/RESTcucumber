package javaPrograms;

import java.util.stream.IntStream;

public class findValue {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5 };
		int num1 = 6;
		boolean found = false;

		for (int element : num) {
			if (num1 == element) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(num1 + " is found.");
		} else {
			System.out.println(num1 + " is not found.");
		}

		System.out.println("//---------------");
		
		 found = IntStream.of(num).anyMatch(n -> n == num1);

	    if(found)
	      System.out.println(num1 + " is found.");
	    else
	      System.out.println(num1 + " is not found.");
	}
}
