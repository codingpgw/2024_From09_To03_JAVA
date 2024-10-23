package com.pcwk.ehr.ed01;
import java.io.*;
public class J01SetOut {

	public static void main(String[] args) {
		PrintStream ps = null;
		
		try {
			
			ps = new PrintStream(new FileOutputStream("pcwk_out.txt"));
			
			//콘솔 출력을 파일로 리다이렉션
			System.setOut(ps);
			
			System.out.println("┌──────────────────────────────────┐");
			System.out.println("│오늘은 즐거운 화요일                    │");
			System.out.println("└──────────────────────────────────┘");
			
			System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
			System.out.println("콘솔에 출력");
			
		}catch(IOException e) {
			
		}finally {
			if(null != ps) {
				ps.close();
			}
		}

	}

}
