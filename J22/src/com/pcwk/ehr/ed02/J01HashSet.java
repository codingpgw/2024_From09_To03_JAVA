package com.pcwk.ehr.ed02;

import java.util.HashSet;
import java.util.Iterator;

public class J01HashSet {

	public static void main(String[] args) {
		String[] names = {"Alice","james","Alice","이상무","Alice","홍길동"};
		
		HashSet set = new HashSet<String>();
		
		for(String name : names) {
			System.out.print(name+",");
			set.add(name);
		}
		System.out.println();
		System.out.println(set.toString());
		
		//요소 삭제
		set.remove("Alice");
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {//데이터가 있으면 true
			System.out.print(iter.next()+",");
		}
	}

}
