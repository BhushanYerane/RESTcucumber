package Collections;

import java.util.ArrayList;
import java.util.Iterator;

//  Write a program to traverse (or iterate) ArrayList

public class ListArrays {

	public static void main(String[] args) {
		ArrayList<Integer> arrylist1 = new ArrayList<Integer>();
		ArrayList<String> arrylist2 = new ArrayList<String>();

		arrylist1.add(12);
		arrylist1.add(43);
		arrylist1.add(78);
		arrylist1.add(2, 39);
		arrylist1.add(-65);

		arrylist2.add("QAZ");
		arrylist2.add("TYU");
		arrylist2.add("YGF");
		arrylist2.add("PLM");
		arrylist2.add("BGR");

		/* For Loop Example for traversing ArrayList */
		System.out.print("1.ForLoop:- ");
		for (int i = 0; i < arrylist1.size(); i++) {
			System.out.print("\t" + arrylist1.get(i));
		}

		System.out.println("\n");

		/* Advanced For Loop Example for iterating ArrayList */
		System.out.print("2.Advance Forloop:- ");
		for (String item : arrylist2) {
			System.out.print(item + "\t");
		}
		
		System.out.println("\n");
		
		/* While Loop Example for iterating ArrayList*/   
		System.out.print("3.WhileLoop:- ");
		int i=0;
		while(arrylist2.size()>i)
		{
			System.out.print(arrylist2.get(i)+"\t");
			i++;
		}
		
		System.out.println("\n");
		
		 /* Iterator Example for Traversing ArrayList */
		System.out.print("4.Using Iterator:- ");
		Iterator<Integer> it = arrylist1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}
		
		System.out.println("\n");
		
		Iterator<String> itr = arrylist2.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"\t");
		}
		
		System.out.println("\n");
		
		/* Collection stream() util example */
		System.out.print("Using Collection stream() util- ");
		
		arrylist1.forEach((num)-> {
			System.out.print(num+"\t");
		} );
		
		System.out.println("\n");
		
		arrylist2.forEach((str)-> {
			System.out.print(str+"\t");
		});
				
	}
}
