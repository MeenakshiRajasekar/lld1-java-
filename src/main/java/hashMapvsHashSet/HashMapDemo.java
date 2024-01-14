package hashMapvsHashSet;

import java.util.HashMap;
import java.util.Map;
/*
 * duplicate values are allowed in hashmap
 * follow key value pair 
 * better performance compared to hashset
 * easily we can get the values using keys as identifiers
 */

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "meenakshi");
		map.put(2, "Abi");
		map.put(3, "Kavi");
		System.out.println("before inserting duplicate values: "+map);
		map.put(10, "meenakshi");
		map.put(11, "Rinu");
		map.put(12, "veena");
		System.out.println("after inserting duplicate values: "+map);
		
		//Iteration in hashmap
		System.out.println("Iteration in hashmap");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key : " +entry.getKey() +" value :  " +entry.getValue());
		}
		
		String newMap = map.toString();
		System.out.println("To string map : "+newMap);
		String defaultValue = map.getOrDefault(10, "meenakshi");
		System.out.println("using get or default value : "+defaultValue);
		String newDefaulterValue = map.getOrDefault(100, "admin");
		System.out.println("new default value with non existing key is : "+ newDefaulterValue);
		
		Map<String, String > checkerMap = new HashMap<String, String>();
		checkerMap.put("key1", "value1");
		String checkerDefault = checkerMap.getOrDefault("key0", "000");
		System.out.println("checker default value is : "+checkerDefault);
		
		checkerMap.replace("key1", "new Value");
		for(Map.Entry<String, String> entry: checkerMap.entrySet() )
			System.out.println("after replacing the values inside checkerMap: " +entry.getKey() +" and "+ entry.getValue() );
		
		checkerMap.remove("key1");
		System.out.println("after removing all the elements");
		System.out.println(checkerMap);
	}
	

}


