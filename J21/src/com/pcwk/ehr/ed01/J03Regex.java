package com.pcwk.ehr.ed01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.pcwk.ehr.cmn.PLog;

public class J03Regex implements PLog {

	public static void main(String[] args) {
		String text = "오늘 즐거운 목요일 2일 전 jamesol@paran.com\r\n"
				+ "j1004@naver.com 10월 15일 입니다.";
		
		String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		
		//find()로 패턴 일치하는 부분 찾기
		while(m.find()) {
			log.debug("email : {}",m.group());
		}

	}

}
