package com.pcwk.ehr.ed02;

public class Tv {
	boolean power;	//전원
	String 	color;	//색상
	public int 	channel; //채널
	
	//메서드
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
}
