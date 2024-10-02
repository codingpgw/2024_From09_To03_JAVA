/**
 * Package Name : com.pcwk.ehr.ed08
 * Class Name : SingleTon.java
 * Description : 싱글톤 패턴
 * Modification information : 
 * --------------------------------
 * 
 *
 * 최초 생성일 : 2024-10-01
 *---------------------------------
 * author : gy
 * since : 2024.09.09
 * see : 
 * copyright (C) by PCWK All right reserved
 */
package com.pcwk.ehr.ed08;

/**
 * 
 */
public class Singleton {
	//유일한 인스턴스를 저장하는 static변수
	private static Singleton instance;
	
	Singleton() {
		super();
		System.out.println("Singleton 생성자");
	}
	
	//인스턴스를 반환하는 static 메서드
	public static Singleton getInstance() {
		if(null == instance) {
			instance = new Singleton();
		}
		
		return instance;
	}
}
