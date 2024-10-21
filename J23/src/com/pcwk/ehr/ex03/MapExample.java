package com.pcwk.ehr.ex03;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			
			totalScore += map.get(key);
			
			if(maxScore < map.get(key)) {
				maxScore = map.get(key);
				name = key;
			}
		}
		System.out.printf("평균 점수 : %.0f%n",(totalScore/(double)set.size()));
		System.out.printf("최고 점수 : %d%n",maxScore);
		System.out.printf("최고점자 : %s%n",name);
	}
}
