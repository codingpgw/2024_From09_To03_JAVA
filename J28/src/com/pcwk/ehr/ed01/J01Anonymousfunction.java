package com.pcwk.ehr.ed01;

public class J01Anonymousfunction {

	public static void main(String[] args) {
		//익명함수
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명함수(Anonymousfunction)");
				
			}
		};
		
		runnable.run();

	}

}
