package Collections;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to convert List to Array

public class ListToArray {

	public static void main(String[] args) {

		// Method1 : Using ArrayList get() method
		ArrayList<String> alist1 = new ArrayList<String>();
		alist1.add("Apple");
		alist1.add("Mangos");
		alist1.add("Orange");
		alist1.add("Banana");
		alist1.add("Kiwi");

		String array1[] = new String[alist1.size()];
		for (int i = 0; i < alist1.size(); i++) {
			array1[i] = alist1.get(i);
		}

		for (String str : array1) {
			System.out.print(str + "\t");
		}

		String[] strArray = alist1.stream().toArray(String[]::new);

		System.out.println(Arrays.toString(strArray));
		
		if(alist1.contains("Pear"))
		{
			System.out.println("Contain in list");
		} else {
			System.out.println("Not Contain in list");
		}

		System.out.println("\n");

		// Method 2 : Using toArray() method
		ArrayList<Integer> alist2 = new ArrayList<Integer>();
		alist2.add(12);
		alist2.add(34);
		alist2.add(56);
		alist2.add(97);
		alist2.add(2, 91);
		// System.out.println(alist2);

		Integer[] arryint = alist2.toArray(new Integer[alist2.size()]);
		for (int val : arryint) {
			System.out.print(val + "\t");
		}

		int[] arr = alist2.stream().mapToInt(i -> i).toArray();
		for (int val : arr) {
			System.out.print(val + " ");
		}
		
		System.out.println("\n");
		
		if(alist2.contains(91))
		{
			System.out.println("Contain in list");
		} else {
			System.out.println("Not Contain in list");
		}

	}
}
