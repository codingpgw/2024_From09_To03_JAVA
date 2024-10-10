package com.pcwk.ehr.ed06;

import java.util.Properties;
import java.util.Set;

public class J05Property {

	public static void main(String[] args) {
		//Java 버전 : 대소문자 구분
		String javaVersion = System.getProperty("java.version");
		System.out.println(javaVersion);
		
		String javaHome = System.getProperty("java.home");
		System.out.println(javaHome);
		
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);
		
		System.out.println("=======================================");
		//모든 시스템 프로퍼티 읽기
		//key      = value
		//user.hom = C:\Users\gy
		Properties props = System.getProperties();
		
		Set<Object> keys = props.keySet();
		
		 for(Object key : keys) {
			 String value = System.getProperty((String)key);
//			 System.out.println(key +" : "+ value);
			 
		 }
	}

}
