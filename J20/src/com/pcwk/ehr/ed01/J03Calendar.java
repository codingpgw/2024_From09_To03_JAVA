package com.pcwk.ehr.ed01;
import java.util.Calendar;

import com.pcwk.ehr.cmn.PLog;

public class J03Calendar implements PLog {

	public static void main(String[] args) {
		Calendar cn = Calendar.getInstance();
		
		// 날짜와 시간 출력
		// 년, 월, 일   시간,분,초
		log.debug(String.format("현재 날짜 : %s/%s/%s%n", cn.get(Calendar.YEAR),
				cn.get(Calendar.MONTH)+1,
				cn.get(Calendar.DAY_OF_MONTH)));
		
		log.debug(String.format("현재 시간 : %s : %s : %s.%s",cn.get(Calendar.HOUR),
				cn.get(Calendar.MINUTE),
				cn.get(Calendar.SECOND),
				cn.get(Calendar.MILLISECOND)));
		
		int amPm = cn.get(Calendar.AM_PM);
		if(amPm == Calendar.AM) {
			log.debug(String.format("오전"));
		}else {
			log.debug(String.format("오후"));
		}
		
		//요일 : 일요일(1) ~ 토요일(7)
		
		//(0~6)
		String[] dayOfWeekString = {"일","월","화","수","목","금","토"};
		
		int dayOfWeek = cn.get(Calendar.DAY_OF_WEEK);
		log.debug("dayOfWeek : {}",dayOfWeek);
		log.debug("{}요일",dayOfWeekString[dayOfWeek-1]);
		
	}

}
