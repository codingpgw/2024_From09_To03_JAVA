package com.pcwk.ehr.ed01;
import java.io.*;
public class J06FileInputStream {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_2024311\\01_JAVA\\WORKSPACE\\J24\\test02.db";
		
		//try-with-resource 사용  finally 생략
		try(FileInputStream fis = new FileInputStream(fileName)) {
			
			byte[] byteArr = new byte[100];
			
			while(true) {
				int num = fis.read(byteArr);
				
				if(num == -1) {
					break;
				}
				
				for(int i=0; i<num; i++) {
					System.out.println(byteArr[i]);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
