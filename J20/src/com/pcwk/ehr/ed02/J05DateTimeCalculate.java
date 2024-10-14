package com.pcwk.ehr.ed02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

import com.pcwk.ehr.cmn.PLog;

public class J05DateTimeCalculate implements PLog {

	public static void main(String[] args) {

		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.of(2025, 3, 11);
//		LocalDate endDate = LocalDate.of(2024, 11, 30);
		
		Period p = Period.between(startDate, endDate);
		log.debug("두 날짜 간의 차이 : {}개월 {}일",p.getMonths(),p.getDays());
		
		LocalTime startTime = LocalTime.now();
		LocalTime endTime = LocalTime.of(17, 50, 0);
		
		Duration duration = Duration.between(startTime, endTime);
		log.debug("시간 차이 : {}시간 {}분 {}초",duration.toHours(),duration.toMinutes()%60,duration.toSeconds()%60);
		
	}

}
