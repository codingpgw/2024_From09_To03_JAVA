/**
 * Package Name : com.pcwk.ehr.ed08
 * Class Name : Main.java
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
package com.pcwk.ehr.ed09;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 */
public class Main {
	static final Logger log = LogManager.getLogger(Main.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		The constructor Singleton() is not visible
//		Singleton instance = new Singleton();
		Singleton singleton01 = Singleton.getInstance();
		Singleton singleton02 = Singleton.getInstance();
		
		log.debug("singleton01 : {}", singleton01.toString());
		log.debug("singleton02 : {}", singleton02.toString());
		
	}

}
//Singleton 생성자
//[2024-10-01 15:26:40] DEBUG Main.main(Main.java:35) - 
//singleton01 : com.pcwk.ehr.ed09.Singleton@35e2d654
//[2024-10-01 15:26:40] DEBUG Main.main(Main.java:36) - 
//singleton02 : com.pcwk.ehr.ed09.Singleton@35e2d654

