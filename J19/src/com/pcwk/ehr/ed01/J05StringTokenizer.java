package com.pcwk.ehr.ed01;

import com.pcwk.ehr.cmn.PLog;
import java.util.StringTokenizer;

public class J05StringTokenizer implements PLog {

	public static void main(String[] args) {
		//기본 공백으로 문자열 분리
		String str = "Java를 배우는 것은 매우 재미있어요.";
		StringTokenizer st = new StringTokenizer(str);
		
		//토큰 출력
		while(st.hasMoreTokens()) {
			log.debug(st.nextToken());
		}
		 String str02 = "apple,banana|orange,grapes";
		 StringTokenizer st2 = new StringTokenizer(str02, ",|");
		 StringTokenizer st3 = new StringTokenizer(str02, ",|",true);
		 while(st2.hasMoreTokens()) {
			 log.debug(st2.nextToken());
		 }
		 while(st3.hasMoreTokens()) {
			 log.debug(st3.nextToken());
		 }
		 

	}

}
