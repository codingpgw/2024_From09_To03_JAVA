package com.pcwk.ehr.ed06;

public class J04CurrentTime {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
//		long startTime = System.nanoTime();
		
		long sum = 0;
		
		for(int i=1; i<=1000_000; i++){
			sum += i;
		}
		
		long endTime = System.currentTimeMillis();
//		long endTime = System.nanoTime();
		
		System.out.println("sum : "+sum);
		System.out.println("경과 시간 : "+(endTime - startTime)); //nanoTime이면 나노초로 표현
		
		
	}

}
