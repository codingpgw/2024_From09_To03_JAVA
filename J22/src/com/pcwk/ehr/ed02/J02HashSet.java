package com.pcwk.ehr.ed02;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class J02HashSet {

	public static void main(String[] args) {
		HashSet set = new HashSet<Integer>();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.print(num+",");
			
			set.add(num);
		}
		System.out.println();
		System.out.println(set.toString());
		
		List<Integer> list = new LinkedList<Integer>(set);
		Collections.sort(list);
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+",");
		}

	}

}
