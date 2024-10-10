package com.pcwk.ehr.ed06;

public class J03 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("인자를 입력하세요.");
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		
		System.out.println("입력 값은 : "+args[0]);
	}
}
