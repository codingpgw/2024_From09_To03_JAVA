package com.pcwk.ehr.ed02;
import java.util.TreeSet;
public class J04TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		//요소추가
		treeSet.add(50);
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(20);
		
		System.out.println(treeSet);
		
		System.out.println(treeSet.first());
		
		System.out.println(treeSet.last());
			
		System.out.println(treeSet.subSet(20, 50));
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		for(int i=1; i<=6; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}

}
