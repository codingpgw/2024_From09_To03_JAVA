package com.pcwk.ehr.ed02;
import java.io.*;
public class J01Writer {

	public static void main(String[] args) {
		//문자 기반 스트림 생성
		try(Writer writer = new FileWriter("pcwk.txt")) {
			//1문자씩 출력
			char ch1 = 'a';
			char ch2 = '1';
			String ch3 = "가";
			
			writer.write(ch1);
			writer.write(ch2);
			writer.write(ch3);
			
			writer.write("\n");
			char[] chArr = {'B','C','D','나'};
			writer.write(chArr);
			
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행 성공");
	}

}
