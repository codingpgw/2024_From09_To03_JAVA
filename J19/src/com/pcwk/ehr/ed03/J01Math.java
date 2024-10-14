package com.pcwk.ehr.ed03;

import com.pcwk.ehr.cmn.PLog;

public class J01Math implements PLog {

	public static void main(String[] args) {
		log.debug("절대값 : "+Math.abs(-30)); //절대값 : 30
		
		log.debug("반올림 : "+Math.round(2.7)); //반올림 : 3
		
		//90.7552 : 소수 둘째 자리에서 반올림
		log.debug("반올림 : "+Math.round(90.7552*100)/100.0); //반올림 : 90.76
		
		log.debug("올림 : "+Math.ceil(2.1)); //올림 : 3.0
		
		log.debug("내림 : "+Math.floor(3.9)); //내림 : 3.0
		
		log.debug("최대 : "+Math.max(15, 13)); //최대 : 15
		
		log.debug("제곱 : "+Math.pow(2, 3)); //제곱 : 8.0
		log.debug("제곱근 : "+Math.sqrt(16)); //제곱근 : 4.0
		
	}
	
}
