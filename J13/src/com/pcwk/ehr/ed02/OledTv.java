package com.pcwk.ehr.ed02;

public class OledTv extends Tv {
	//밝기
	int brightness;

	public OledTv() {

	}
	//밝기 조절 메서드
	public void adjustBrightness(int level) {
		this.brightness = level;
		System.out.println("밝기 : "+brightness);
	}
}
