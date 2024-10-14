package com.pcwk.ehr.ed02;

import java.time.*;
import com.pcwk.ehr.cmn.PLog;

public class J01DateTime implements PLog {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		log.debug("현재 날짜 : {}",ld.toString());
		
		LocalTime lt = LocalTime.now();
		log.debug("현재 시간 : {}",lt.toString());
		
		LocalDateTime ldt = LocalDateTime.now();
		log.debug("현재 날짜+시간 : {}",ldt.toString());
		
		System.out.println("==================================================================================");
		
		ZonedDateTime zdt = ZonedDateTime.now();
		log.debug("시스템의 기본 시간대의 현재 날짜와 시간 : {}",zdt);
		
		//뉴욕 시간대의 현재 날짜, 시간
		ZonedDateTime nYorkT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		log.debug("뉴욕 날짜 시간 : {}",nYorkT);
	}

}
