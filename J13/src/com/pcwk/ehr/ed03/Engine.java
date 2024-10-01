package com.pcwk.ehr.ed03;

public class Engine {
	String type;

	public Engine() {

	}

	public Engine(String type) {
		this.type = type;
	}
	
	public void start() {
		System.out.println(type+"엔진이 작동합니다.");
	}
	public void stop() {
		System.out.println(type+"엔진이 멈췄습니다.");
	}
}
