package com.pcwk.ehr.ed06;
import java.io.IOException;
import java.nio.file.*;
public class J03FileWrite {

	public static void main(String[] args) {
		Path path = Paths.get("pcwk_output.txt");
		String content = "오늘 오전 수업은 여기까지 입니다.";
		
		try {
			Files.writeString(path, content);
			System.out.println("파일 생성 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
