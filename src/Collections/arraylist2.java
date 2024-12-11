package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(48);
		arrlist.add(24);
		arrlist.add(72);
		arrlist.add(216);
		arrlist.add(240);
		arrlist.add(96);
		arrlist.add(120);
		arrlist.add(144);
		arrlist.add(168);
		arrlist.add(192);
		
		System.out.println(arrlist);
		
		Collections.sort(arrlist);
		System.out.println(arrlist);
		
		for(int i=2;i<arrlist.size();i+=2)
			arrlist.remove(i);
				
		System.out.println(arrlist);
	
	}
}
