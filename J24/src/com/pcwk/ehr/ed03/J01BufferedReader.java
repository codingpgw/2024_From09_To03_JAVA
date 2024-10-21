package com.pcwk.ehr.ed03;
import java.io.*;
public class J01BufferedReader {
	
	public static void main(String[] args) {
		FileReader rf = null;
		BufferedReader br = null;
		long start = System.currentTimeMillis();
		try {
			rf = new FileReader("bit.txt");
			br = new BufferedReader(rf);
			
			String line = "";
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
//			보조 스트림을 종료하면 기반 스트림을 컴파일러가 닫음
//			if(null != rf) {
//			try {
//				rf.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
			if(null != br) {
				try {
					br.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"밀리초");
	}

}
