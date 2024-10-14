package com.pcwk.ehr.ed02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.pcwk.ehr.cmn.PLog;

public class J04DateTimeFormatter implements PLog {

	public static void main(String[] args) {
		
		ZonedDateTime czdt = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), 
				ZoneId.of("Asia/Seoul"));
		log.debug("ZonedDateTime : {}",czdt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("Q yyyy/MM/dd HH:mm:ss Z");
		log.debug("{}", czdt.format(dtf));

	}

}
