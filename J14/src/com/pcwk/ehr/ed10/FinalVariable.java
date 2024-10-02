/**
 * Package Name : com.pcwk.ehr.ed10
 * Class Name : FinalVariable.java
 * Description : 
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
package com.pcwk.ehr.ed10;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 */
public class FinalVariable {
	static final Logger log = LogManager.getLogger(FinalVariable.class);
	
	final int MAX_VALUE;//상수
	/**
	 * @param args
	 */
	public FinalVariable() {
		MAX_VALUE = 88;//상수값이 초기화가 되지 않은 경우, 생성자에서 초기화할 수 있다.
	}
	
	public void showFinal() {
		//MAX_VALUE = 100; 불가
		log.debug("MAX_VALUE : {}",MAX_VALUE);
	}
	
	public static void main(String[] args) {
		FinalVariable fv = new FinalVariable();
		fv.showFinal();
	}
}
//[2024-10-01 15:49:35] DEBUG FinalVariable.showFinal(FinalVariable.java:37) - MAX_VALUE : 88

