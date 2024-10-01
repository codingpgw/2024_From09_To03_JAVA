package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		//스마트 Tv 객체 생성
		SmartTv st = new SmartTv();
		st.power(); //전원켜기
		
		st.runApp("YouTube");
		st.closeApp();
		
		System.out.println("=============================================");
		//OLED Tv  객체 생성
		OledTv ot = new OledTv();
		ot.power();
		
		ot.channelUp();//채널 증가
		ot.adjustBrightness(88);//밝기 조정

	}

}
//Tv전원이 켜졌습니다.
//YouTube을 실행합니다.
//YouTube을 중지합니다.
//=============================================
//Tv전원이 켜졌습니다.
//채널 : 1
//밝기 : 88

