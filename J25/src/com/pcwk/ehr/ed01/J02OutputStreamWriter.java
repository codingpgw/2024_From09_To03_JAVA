package com.pcwk.ehr.ed01;
import java.io.*;
public class J02OutputStreamWriter {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
				){
			bw.write("새로운 월요일!");
			bw.newLine();
			bw.write("가을입니다.");
		}catch(IOException e) {
			System.out.println("IOException : "+e.getMessage());
		}
		
		System.out.println("생성 완료");
	}

}
