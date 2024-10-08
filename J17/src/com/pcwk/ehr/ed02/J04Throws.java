package com.pcwk.ehr.ed02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J04Throws {
	
	public static void readFile(String filePath) throws FileNotFoundException,IOException {
		FileInputStream fis = new FileInputStream(filePath);
		int data;
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
		}
		fis.close();
	}
	
	public static void main(String[] args) {
		String filePath = "C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_2024311\\01_JAVA\\WORKSPACE\\J17\\src\\com\\pcwk\\ehr\\ed02\\J04Throws.java";
		try {
			readFile(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다."+e.getMessage());
		} catch (IOException e) {
			System.out.println("파일 읽기 중 오류 발생"+e.getMessage());
		}
		
		System.out.println("프로그램 종료");

	}

}
