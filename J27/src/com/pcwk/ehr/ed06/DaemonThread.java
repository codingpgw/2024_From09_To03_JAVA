package com.pcwk.ehr.ed06;

import java.io.FileWriter;
import java.io.IOException;

public class DaemonThread extends Thread {

	@Override
	public void run() {
		try(FileWriter writer = new FileWriter("daemon_output.txt",true)){
			while(true) {
				writer.write("DaemonThread가 실행 중입니다.\n");
				writer.flush();
				
				System.out.println("DaemonThread가 파일에 기록 중 ...");
				Thread.sleep(3*1000);//3초 대기
				
				
			}
			
		}catch(IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
