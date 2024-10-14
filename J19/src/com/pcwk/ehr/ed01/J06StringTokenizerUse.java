package com.pcwk.ehr.ed01;

import java.util.StringTokenizer;

import com.pcwk.ehr.cmn.PLog;

public class J06StringTokenizerUse implements PLog {

	public static void main(String[] args) {
		String data = "1,이상무,100,100,100|2,홍길동,20,20,20|3,철수,40,40,40|4,영희,60,60,60|5,순히,80,80,80";
		StringTokenizer st = new StringTokenizer(data, "|");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
			String[] user = token.split(",");
			
			int total = Integer.parseInt(user[2])+Integer.parseInt(user[3])+Integer.parseInt(user[4]);
			log.debug("학생 : "+user[1]+", 합계 : " +total);
			
		}
	}
}
