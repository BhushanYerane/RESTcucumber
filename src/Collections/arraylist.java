package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
		ArrayList<Integer> arrlist2 = new ArrayList<Integer>();
		
		arrlist1.add(3);
		arrlist1.add(1);
		arrlist1.add(11);
		arrlist1.add(19);
		arrlist1.add(17);
		
		arrlist2.add(5);
		arrlist2.add(2);
		arrlist2.add(6);
		arrlist2.add(7);
		arrlist2.add(20);
		
		System.out.println(arrlist1);
		System.out.println(arrlist2);
		
		arrlist1.addAll(arrlist2);
		Iterator it = arrlist1.iterator();
		while(it.hasNext())
			System.out.print(it.next()+"\t");
		
		System.out.print("\n");
		
		Collections.sort(arrlist1);
		System.out.println(arrlist1);
		
		System.out.println(arrlist1.get(2));
		System.out.println(arrlist1.get(6));
		System.out.println(arrlist1.get(8));
		
		ArrayList<Integer> arrlist3 = new ArrayList<Integer>();
		arrlist3.add(arrlist1.get(2));
		arrlist3.add(arrlist1.get(6));
		arrlist3.add(arrlist1.get(8));
		
		System.out.println(arrlist3);
	}

}
