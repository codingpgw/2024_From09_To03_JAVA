package com.pcwk.ehr.ed01;
import java.io.*;
public class J02InputStream {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("text.txt");
//			fis = new FileInputStream(args[0]);
			
			int data = 0;
			while((data=fis.read()) != -1) {
				System.out.println(data);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("프로그램 수행 완료");
	}

}
