package com.pcwk.ehr.ed05;

public class PriorityThread extends Thread {

	public PriorityThread(String name) {
		super(name);//스레드 이름 설정
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(getName()+"- Priority : "+getPriority() +"-");
		}
	}

}
