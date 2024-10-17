package com.pcwk.ehr.ed01;

import java.util.LinkedList;

import com.pcwk.ehr.cmn.PLog;

public class J02LinkedList implements PLog {
	
	public static void displayLinkedList(LinkedList<String> list) {
		for(String str : list) {
			log.debug(str);
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> lL = new LinkedList<String>();
		
		//요소 추가
		lL.add("Java");
		lL.add("Oracle");
		lL.add("Html");
		lL.add("Css");
		lL.add("Javascript");
		lL.add("Spring");
		lL.add("Python");
		
		displayLinkedList(lL);
		
		log.debug("요소의 개수 : {}",lL.size());
		
		log.debug("displayLinkedList[1] : {}",lL.get(1));
		
		//요소 수정
		lL.set(5,"Spring Boot");
		displayLinkedList(lL);
		
		lL.remove(3);
		displayLinkedList(lL);
	}

}
