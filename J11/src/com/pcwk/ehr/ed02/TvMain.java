package com.pcwk.ehr.ed02;

public class TvMain {

	public static void main(String[] args) {
		Tv tv;			//Tv변수 tv선언
		tv = new Tv();  //Tv인스턴스 생성
		
		tv.power();//Tv 전원 on
		
		tv.channel = 3;
		
		tv.channelUp();
		tv.channelUp();
		
		tv.channelDown();
		System.out.println("현재 채널은 "+tv.channel);
		
	}

}
