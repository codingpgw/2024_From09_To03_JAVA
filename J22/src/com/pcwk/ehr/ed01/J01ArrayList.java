package com.pcwk.ehr.ed01;

import java.util.ArrayList;

import com.pcwk.ehr.cmn.PLog;

public class J01ArrayList implements PLog {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		
//		log.debug("저장 용량 : {}",list);
		
		list.add("Pear");
		list.add("Banana");
		list.add("Apple");
		
		log.debug("list의 요소 크기 : {}",list.size());
		
		for(int i=0; i<list.size(); i++) {
			log.debug("요소 : {}, 값 : {}",i,list.get(i));
		}
		
		list.set(1, "Watermelon");
		log.debug("요소 : {}, 값 : {}",1,list.get(1));
		
		if(list.contains("Pear")) {
			log.debug("Pear가 있어요");
		}else {
			log.debug("Pear가 없어요");
		}
	}

}
