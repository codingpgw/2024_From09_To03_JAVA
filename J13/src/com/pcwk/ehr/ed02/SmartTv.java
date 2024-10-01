package com.pcwk.ehr.ed02;

public class SmartTv extends Tv {
	String app;//현재 실행 중인 앱

	public SmartTv() {
		
	}
	
	//앱실행 메서드
	public void runApp(String appName) {
		this.app = appName;
		System.out.println(appName+"을 실행합니다.");
	}
	public void closeApp() {
		System.out.println(app+"을 중지합니다.");
		app = null;
	}
	
}
