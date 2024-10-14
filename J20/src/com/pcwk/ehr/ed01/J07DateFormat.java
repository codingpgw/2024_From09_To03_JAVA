package com.pcwk.ehr.ed01;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.pcwk.ehr.cmn.PLog;

public class J07DateFormat implements PLog{

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
		log.debug("현재 날짜 : {}",sdf.format(date));
		
		//올해의 D번째 날
		sdf = new SimpleDateFormat("올해의 D번째 날");
		log.debug("{}",sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		log.debug("{}",sdf.format(date));

	}

}
