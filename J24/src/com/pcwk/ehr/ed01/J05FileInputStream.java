package com.pcwk.ehr.ed01;
import java.io.*;
public class J05FileInputStream {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_2024311\\01_JAVA\\WORKSPACE\\J24\\test02.db";
		
		//try-with-resource 사용  finally 생략
		try(FileInputStream fis = new FileInputStream(fileName)) {
			int data = 0;
			while((data = fis.read()) != -1) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
