package com.pcwk.ehr.ed02;
import java.io.*;
public class J03Reader {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_2024311\\01_JAVA\\WORKSPACE\\J24\\pcwk.txt";
		try(Reader reader = new FileReader(filePath)) {
			
			char[] data = new char[99];
			
			while(true) {
				int len = reader.read(data);
				
				if(len == -1) {break;}
				
				for(int i=0; i<len; i++) {
					System.out.print(data[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
