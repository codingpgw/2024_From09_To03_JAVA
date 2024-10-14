package com.pcwk.ehr.ed02;

import java.util.ArrayList;

import com.pcwk.ehr.cmn.PLog;

public class J01Wrapper implements PLog{

	public static void main(String[] args) {
		//기본 자료형 -> 래퍼클래스(박싱)
		Integer intObj = Integer.valueOf(23);
		
		int intValue = intObj.intValue();
		
		log.debug("Integer obj : "+intObj.toString());
		log.debug("언박싱 int value : "+intValue);
		
		Integer autoAge = 22;
		int autoUnboxingAge = autoAge;
		
		log.debug("Auto-boxing : "+autoAge);
		log.debug("Auto-unboxing : "+autoUnboxingAge);
		//wrapper 용도
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(autoAge);
		arrList.add(autoUnboxingAge);
		arrList.add(13);
		
		System.out.println(arrList.get(2));
	}

}
