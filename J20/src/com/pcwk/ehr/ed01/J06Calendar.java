package com.pcwk.ehr.ed01;

import java.util.Calendar;

import com.pcwk.ehr.cmn.DateUtil;
import com.pcwk.ehr.cmn.PLog;

public class J06Calendar implements PLog {

	public static void main(String[] args) {
		int year;
		int month;
		//1.년도, 월 입력
		if(args.length != 2) {
			System.out.println("년도와 월을 입력하세요. ex)2024 10");
			System.exit(0);
		}
		
		String yearString = args[0];
		String monthString = args[1];
		log.debug("yearString : {}",yearString);
		log.debug("monthString : {}",monthString);
		
		//문자 -> 숫자
		year = Integer.parseInt(yearString);
		month = Integer.valueOf(monthString);
		
		//2. 시작요일
		//ex) 2024/10/1(시작일), 시작요일 구하기
		
		Calendar cn = Calendar.getInstance();
		
		//시작일 set
		cn.set(Calendar.YEAR, year);
		cn.set(Calendar.MONTH, month-1);
		cn.set(Calendar.DAY_OF_MONTH,1);
		
		log.debug(DateUtil.toDateYMD(cn));
		
		String[] dayOfWeek = {"일","월","화","수","목","금","토"};
		//1일의 요일
		int firstDay = cn.get(Calendar.DAY_OF_WEEK);
		//log.debug("달의 첫 요일 : {}",firstDay);
		
		int lastDay = cn.getActualMaximum(Calendar.DAY_OF_MONTH);
		//log.debug("달의 마지막 요일 : {}",lastDay);
		System.out.println(DateUtil.toDateYM(cn));
		
		for(String week : dayOfWeek) {
			System.out.print(week+"\t ");
		}
		System.out.println("\n─────────────────────────────────────────────────────");
		//시작 요일 : 화
		for(int i=1; i<firstDay; i++) {
			System.out.print("\t");
		}
		for(int i=1; i<=lastDay; i++) {
			System.out.printf("%2d\t",i);
			if(firstDay % 7 == 0) {
				System.out.println();
			}
			firstDay++;
		}
	}

}
