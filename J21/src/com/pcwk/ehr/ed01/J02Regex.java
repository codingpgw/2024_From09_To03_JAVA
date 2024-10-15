package com.pcwk.ehr.ed01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.pcwk.ehr.cmn.PLog;

public class J02Regex implements PLog {

	public static void main(String[] args) {
		// email 정규 표현식
		String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		
		String email = "jamesol@paran.com";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(email);
		
		if(m.matches() == true) {
			log.debug("email : {}은 유효합니다.",email);
		}else {
			log.debug("email : {}은 유효하지 않습니다.",email);
		}
	}

}
