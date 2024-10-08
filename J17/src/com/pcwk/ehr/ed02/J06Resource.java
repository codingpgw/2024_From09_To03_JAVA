package com.pcwk.ehr.ed02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class J06Resource {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_2024311\\01_JAVA\\WORKSPACE\\J17\\src\\com\\pcwk\\ehr\\ed02\\J06Resource.java";
		//try-with-resource
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.out.println("파일을 읽는 중 예외가 발생했습니다."+e.getMessage());
		}

	}

}
