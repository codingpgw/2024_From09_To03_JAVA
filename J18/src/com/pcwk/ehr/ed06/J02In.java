package com.pcwk.ehr.ed06;

import java.io.IOException;

public class J02In {

	public static void main(String[] args) {
		try {
			System.out.print("keyboard 입력 >");
			int keyCode = System.in.read();
			System.out.println("keyCode : "+keyCode);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

//keyboard 입력 >a
//keyCode : 97
