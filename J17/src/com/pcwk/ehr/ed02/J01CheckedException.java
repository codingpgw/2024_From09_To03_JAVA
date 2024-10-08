package com.pcwk.ehr.ed02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J01CheckedException {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\gy111\\OneDrive\\바탕 화면\\JAP_2024311\\01_JAVA\\WORKSPACE\\J17\\src\\com\\pcwk\\ehr\\ed02\\J01CheckedException.java";
		FileInputStream fis = null;
		//Unhandled exception type FileNotFoundException
		try {
			fis = new FileInputStream(filePath);
			
			int data;
			while((data = fis.read()) != -1 ) {
				//바이트 데이터를 문자로 변환
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			String message = e.getMessage();
			System.out.println("message : "+message);
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
