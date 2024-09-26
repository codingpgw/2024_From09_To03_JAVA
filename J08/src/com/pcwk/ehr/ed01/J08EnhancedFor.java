package com.pcwk.ehr.ed01;

import java.util.List;
import java.util.ArrayList;

public class J08EnhancedFor {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("Bob");
		names.add("김철수");
		
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
