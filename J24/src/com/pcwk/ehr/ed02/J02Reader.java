package com.pcwk.ehr.ed02;
import java.io.*;
public class J02Reader {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_2024311\\01_JAVA\\WORKSPACE\\J24\\pcwk.txt";
		try(Reader reader = new FileReader(filePath)) {
			
			//1문자
			int data = 0;
			while((data = reader.read()) != -1) {
				System.out.println((char)data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
