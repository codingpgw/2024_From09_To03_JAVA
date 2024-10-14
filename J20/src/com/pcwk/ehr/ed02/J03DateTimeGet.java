package com.pcwk.ehr.ed02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

import com.pcwk.ehr.cmn.PLog;

public class J03DateTimeGet implements PLog {

	public static void main(String[] args) {
		//현재 날짜와 시간:
		LocalDate cd = LocalDate.now();
		
		int year = cd.getYear();
		int month = cd.getMonthValue();
		int day = cd.getDayOfMonth();		
		log.debug("year : {}",year);
		log.debug("month : {}",month);
		log.debug("day : {}",day);
		log.debug("-------------------------------");
		year = cd.get(ChronoField.YEAR);
		month = cd.get(ChronoField.MONTH_OF_YEAR);
		day = cd.get(ChronoField.DAY_OF_MONTH);
		//Monday(1) to Sunday(7)
		int week = cd.get(ChronoField.DAY_OF_WEEK);
		
		log.debug("year : {}",year);
		log.debug("month : {}",month);
		log.debug("day : {}",day);
		log.debug("week : {}",week);
		log.debug("-------------------------------");
		
		//현재 시간 :
		LocalTime ct = LocalTime.now();
		
		int hour = ct.get(ChronoField.HOUR_OF_DAY);
		int minute = ct.get(ChronoField.MINUTE_OF_HOUR);
		int second = ct.get(ChronoField.SECOND_OF_MINUTE);
		log.debug("hour : {}",hour);
		log.debug("minute : {}",minute);
		log.debug("second : {}",second);
		
	}

}
