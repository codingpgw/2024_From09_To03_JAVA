package com.pcwk.ehr.ed02;

import java.util.HashSet;
import java.util.Iterator;

public class J03HashSet {

	public static void main(String[] args) {
		
		Member m1 = new Member("james", "이상무", "4321");
		Member m2 = new Member("james", "이상무", "4321");
		
		HashSet<Member> set = new HashSet<Member>();
		set.add(m1);
		set.add(m2);
		
		Iterator<Member> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
