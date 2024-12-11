package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Write a program to traverse(or iterate) HashSet?

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> hset1 = new HashSet<String>();
		hset1.add("Modi");
		hset1.add("Shah");
		hset1.add("Gandhi");
		hset1.add("Pawar");
		hset1.add("Singh");
		
		System.out.println(hset1);
		
		Iterator<String> hit = hset1.iterator();
		while(hit.hasNext())
		{
			System.out.print(hit.next()+"\t");
		}
		
		System.out.println("\n");
		
		HashSet<Integer> hset2 = new HashSet<Integer>();
		hset2.add(121);
		hset2.add(441);
		hset2.add(961);
		hset2.add(1681);
		hset2.add(2601);
		
		System.out.println("HashSet contains :");
		
		Iterator<Integer> hit1 = hset2.iterator();
		while(hit1.hasNext())
		{
			System.out.print(hit1.next()+"\t");
		}
		
		System.out.println("\n");
		
		if(hset2.contains(484))
		{
			System.out.println("Contain in HashSet List");
		} else {
			System.out.println("Not Contain in HashSet List");
		}
		System.out.println("//------------------");
		
		Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 };
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		System.out.println(set);
		
		Set<Integer> set1 = Collections.<Integer> emptySet();
        Collections.addAll(set1 = new HashSet<Integer>(Arrays.asList(arr)));
        Set<Integer> set2 = Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(arr)));
        
        System.out.println(set2);
		
	}
}
