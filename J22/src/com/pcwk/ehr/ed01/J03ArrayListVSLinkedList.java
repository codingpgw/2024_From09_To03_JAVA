package com.pcwk.ehr.ed01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.pcwk.ehr.cmn.PLog;

public class J03ArrayListVSLinkedList implements PLog {
	//순차적인 추가 : ArrayList, LinkedList -> ArrayList
	public static long sequentialAdd(List<Member> list) {
		long resultTime = 0L;
		
		long startTime = System.currentTimeMillis();
		for(int i=1; i<=1_000_000; i++) {
			list.add(new Member("user"+i, "이상무"+i, "4321"));
		}
		
		long endTime = System.currentTimeMillis();
		
		resultTime = endTime - startTime;
		
		return resultTime;
	}
	
	public static long middleAdd(List<Member> list) {
		
		long startTime = System.currentTimeMillis();
		for(int i=1; i<=1_0000; i++) {
			list.add(new Member("user"+i, "이상무"+i, "4321"));
		}
		
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
	public static long removeList(List<Member> list) {
		long startTime = System.currentTimeMillis();
//		for(int i=1; i<=100; i++) {
//			list.remove(i);
//		}
		for(int i=list.size()-1; i>=100; i--) {
			list.remove(i);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Member> aL = new ArrayList<Member>();
		LinkedList<Member> lL = new LinkedList<>();
		
		System.out.println("=====순차적 추가=====");
		System.out.println("arrayList : "+sequentialAdd(aL));
		System.out.println("linkedList : "+sequentialAdd(lL));
//		System.out.println("=====중간에 추가=====");
//		System.out.println("arrayList : "+middleAdd(aL));
//		System.out.println("linkedList : "+middleAdd(lL));
		
		System.out.println("=====삭제=====");
		System.out.println("arrayList : "+removeList(aL));
		System.out.println("linkedList : "+removeList(lL));
		
	}
}
