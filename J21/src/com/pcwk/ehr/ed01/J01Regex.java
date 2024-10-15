package com.pcwk.ehr.ed01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.pcwk.ehr.cmn.PLog;

public class J01Regex implements PLog{

	public static void main(String[] args) {
		//1. Pattern 객체 생성
		String regex = "\\d{3}-\\d{3,4}-\\d{4}";//핸드폰 번호
		
		Pattern p = Pattern.compile(regex);
		
		//2. pattern.matcher()로 특정 문자열에 적용.
		String cellPhone = "010-1234-5678";
		Matcher	matcher = p.matcher(cellPhone);
		
		//3. 패턴과 일치하는지 여부 확인
		if(matcher.matches() == true) {
			log.debug("전화 번호 : {}, 일치 : {}",cellPhone,matcher.matches());
		}else {
			log.debug("잘못된 전화번호 형식");
		}
		
		//4. split()을 사용해서 문자열 분리
		String input = "sql,oracle,spring";
		Pattern sp = Pattern.compile(",\\s*");
		
		String[] works = sp.split(input);
		for(String work : works) {
			log.debug(work);		}
	}

}
