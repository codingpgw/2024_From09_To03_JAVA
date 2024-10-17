package com.pcwk.ehr.ed03;

import java.util.HashMap;
import java.util.Iterator;

public class J01HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("1호", 18);
		map.put("2호", 15);
		map.put("3호", 13);
		
		System.out.println("1호의 값 : "+map.get("1호"));
		
		System.out.println("Keys : "+map.keySet());
		
		System.out.println("Values : "+map.values());
		
		System.out.println("삭제 : "+map.remove("3"));
		
		//모든 요소에 접근
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+","+map.get(key));
		}
	}

}
