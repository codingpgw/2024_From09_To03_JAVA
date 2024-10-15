package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		
		box.content = "오후";
		
		//형변환 생략
		String content = box.content;
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.content = 15;
		
		int num = intBox.content;
	}

}
