package com.pcwk.ehr.ed03;

import java.util.TreeMap;

public class J04TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> tM = new TreeMap<String,Integer>();
		
		tM.put("Banana", 1000);
		tM.put("Apple", 2000);
		tM.put("Orange", 1200);
		tM.put("Mango", 3000);	
		
		//키가 정렬된 상태로 출력
		System.out.println(tM);
		System.out.printf("%s : %d%n","Mango",tM.get("Mango"));
		System.out.printf("%s %n",tM.firstKey());
		System.out.printf("%s %n",tM.lastKey());
	}

}
