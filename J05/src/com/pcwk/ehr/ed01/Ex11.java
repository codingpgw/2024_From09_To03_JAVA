package com.pcwk.ehr.ed01;

public class Ex11 {
	
	public static void main(String[] args) {
		//변수 사용 범위
		
		int v1 = 1;
		System.out.println("v1 : " +v1);
		
		if(true) {
			int v2 = 2;
			
			if(true) {
				int v3 = 2;
				
				System.out.println("v1 : " +v1 + "안녕하세요");
				System.out.println("v2 : " +v2);
				System.out.println("v3 : " +v3);
			
			}
			System.out.println("v1 : " +v1);
			System.out.println("v2 : " +v2);
			//System.out.println("v3 : " +v3);
		}
		System.out.println("v1 : " +v1);
		//System.out.println("v2 : " +v2);
		//System.out.println("v3 : " +v3);
	}
}
