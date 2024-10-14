package com.pcwk.ehr.ed01;

import com.pcwk.ehr.cmn.PLog;

public class J04StringBuilder implements PLog{

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		log.debug("sb : "+sb.capacity());
		sb.append("12345678901234567\n");
		System.out.println(sb.toString());
		log.debug("sb.length() : "+sb.length());
		log.debug("sb : "+sb.capacity());
		
		sb.append("SELECT      \n");
		sb.append("		  name,       \n");
		sb.append("		  password    \n");
		sb.append("	  FROM member \n");
	 
		System.out.println(sb.toString());
		log.debug("sb.length() : "+sb.length());
	}

}
