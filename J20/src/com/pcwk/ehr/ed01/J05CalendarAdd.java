package com.pcwk.ehr.ed01;

import java.util.Calendar;

import com.pcwk.ehr.cmn.DateUtil;
import com.pcwk.ehr.cmn.PLog;

public class J05CalendarAdd implements PLog {

	public static void main(String[] args) {
		Calendar cn = Calendar.getInstance();
		
		log.debug(DateUtil.toDateYMD(cn));
		
		//3일 후의 날짜
		cn.add(Calendar.DATE, 3);
		log.debug("3일 후의 날짜 : {}",DateUtil.toDateYMD(cn));
		
		//5개월 후의 날짜
		cn.add(Calendar.MONTH, 5);
		log.debug("5개월 후의 날짜 : {}",DateUtil.toDateYMD(cn));
	}

}
