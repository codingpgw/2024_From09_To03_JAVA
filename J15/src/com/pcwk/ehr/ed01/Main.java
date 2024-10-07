package com.pcwk.ehr.ed01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//import 없이 클래스 사용:
		//java.util.Date today = new java.util.Date();
		
		Date today = new Date();
		
		System.out.println("today : "+today);
		
		//날짜형식 지정, 시간 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		//시간 형식 지정
		SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println(sdf.format(today));
		System.out.println(sdfTime.format(today));

	}

}

//today : Tue Oct 01 11:14:33 KST 2024
//2024/10/01
//11:14:33 오전