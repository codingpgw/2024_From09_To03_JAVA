package com.pcwk.ehr.ed05;

public class Main {
	public static void main(String[] args) {
		
		//우선 순위가 낮은 스레드
		PriorityThread lpt = new PriorityThread("lpt");
		lpt.setPriority(Thread.MIN_PRIORITY);//우선 순위 1
		
		//기본 순위
		PriorityThread npt = new PriorityThread("npt");
		npt.setPriority(Thread.NORM_PRIORITY);
		
		PriorityThread mpt = new PriorityThread("mpt");
		mpt.setPriority(Thread.MAX_PRIORITY);
		
		lpt.start();
		npt.start();
		mpt.start();
	}
}
