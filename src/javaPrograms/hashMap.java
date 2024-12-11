package javaPrograms;

import java.util.HashMap;

public class hashMap {
	
	public static void main(String[] args)
    {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put(null, 40);
        map.put(null, null);
        
        System.out.println("Size of map is:- "+ map.size());
        
        System.out.println(map);
                
        if (map.containsKey("vishal")) 
        {
            Integer a = map.get("vishal");
 
            System.out.println("value for key" + " \"vishal\" is:- " + a);
        }
        
        System.out.println(map.get(null));
        System.out.println(map.get(40));
        
        System.out.println("//-----------------");
        
        HashMap<Integer, String> hm1 = new HashMap<>();
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
        
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
 
        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");
        
        System.out.println("Mappings of HashMap hm1 are : "+ hm1);
        System.out.println("Mapping  of HashMap hm2 are : "+ hm2);
    }
}
