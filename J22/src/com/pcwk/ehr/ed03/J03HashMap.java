package com.pcwk.ehr.ed03;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class J03HashMap {
	public static void displayMap(Map<String, Integer> map) {
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+":"+map.get(key));
		}
	}
	
	public static void main(String[] args) {
		String[] data = {"A","B","A","B","C","A","B","C","D","Z"};
		
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		for(String str : data) {
			if(map.containsKey(str)) {
				Integer value = map.get(str);
				map.put(str, value.intValue()+1);
			}else {
				map.put(str, 1);				
			}
		}
		displayMap(map);
		
		
	}

}
