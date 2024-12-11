package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		
		TreeMap<String, String> trimap = new TreeMap<String,String>(Collections.reverseOrder());
		
		trimap.put("A", "Pune");
		trimap.put("Z", "Nagpur");
		trimap.put("S", "Bhandara");
		trimap.put("D", "Jalana");
		trimap.put("M", "Mumbai");
		
		//System.out.println(trimap);
		
		Set set = trimap.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
		}
		
		System.out.println("------------------");
		
		Set<String> keySet = trimap.descendingKeySet();
		
		 System.out.println("TreeMap after reverse:");
		 
		 for (String key : keySet) {
	             System.out.println(key + " = "
	                               + trimap.get(key));
	        }
		
	}
}
