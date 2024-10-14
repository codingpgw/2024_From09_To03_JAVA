package com.pcwk.ehr.ed02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import com.pcwk.ehr.cmn.PLog;

public class J02DateTime implements PLog {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		log.debug("현재 날짜 : {}",ld.toString());
		
		//특정 날짜
		LocalDate userDate = LocalDate.of(2025, 3, 11);
		log.debug("특정 날짜 : {}",userDate);
		
		LocalTime lt = LocalTime.now();
		log.debug("현재 시간 : {}",lt.toString());
		
		//특정 시간
		LocalTime userTime = LocalTime.of(17, 50, 0);
		log.debug("특정 시간 : {}",userTime);
		
		LocalDateTime ldt = LocalDateTime.now();
		log.debug("현재 날짜+시간 : {}",ldt.toString());
		
		//특정 날짜 + 시간
		LocalDateTime udt = LocalDateTime.of(2025, 3,11,17,50,0);
		log.debug("특정 날짜+시간 : {}",udt.toString());
		
		System.out.println("==================================================================================");
		
		ZonedDateTime zdt = ZonedDateTime.now();
		log.debug("시스템의 기본 시간대의 현재 날짜와 시간 : {}",zdt);
		
		//뉴욕 시간대의 현재 날짜, 시간
		ZonedDateTime nYorkT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		log.debug("뉴욕 날짜 시간 : {}",nYorkT);
	}

}
