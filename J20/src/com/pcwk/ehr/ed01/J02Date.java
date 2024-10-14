package com.pcwk.ehr.ed01;

import com.pcwk.ehr.cmn.PLog;

import java.text.SimpleDateFormat;
import java.util.*;

public class J02Date implements PLog {

	public static void main(String[] args) {
		Date date = new Date();
		
		log.debug(String.format("현재 날짜 : %s%n", date.toString()));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:SS");
		log.debug("현재 날짜 : {}",sdf.format(date));
	}

}
