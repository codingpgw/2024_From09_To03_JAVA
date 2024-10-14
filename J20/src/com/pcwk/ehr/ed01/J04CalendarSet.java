package com.pcwk.ehr.ed01;

import java.util.Calendar;

import com.pcwk.ehr.cmn.PLog;

public class J04CalendarSet implements PLog {
	public static String toDateString(Calendar cn) {
		String formatDate = "";
		formatDate = cn.get(Calendar.YEAR) +
		"/"+(cn.get(Calendar.MONTH)+1)
		+"/"+cn.get(Calendar.DAY_OF_MONTH);
		
		return formatDate;
	}
	
	public static void main(String[] args) {
		Calendar cn = Calendar.getInstance();
		
		//날짜 설정
		//2024년 10월 마지막 날짜 설정
		cn.set(Calendar.YEAR, 2024);
		cn.set(Calendar.MARCH, 10-1);//10월
		int lastDayOfMonth = cn.getActualMaximum(Calendar.DAY_OF_MONTH);
		cn.set(Calendar.DAY_OF_MONTH, lastDayOfMonth);
		
		log.debug(toDateString(cn));
	}

}
