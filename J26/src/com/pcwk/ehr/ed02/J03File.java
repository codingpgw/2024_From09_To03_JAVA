package com.pcwk.ehr.ed02;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J03File {

	public static void main(String[] args) throws IOException {
		// D:\\temp\\2024\\10
		
		//10월 
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		String month = sdf.format(new Date());
		System.out.printf("month : %s%n",month);
		
		//파일 객체 생성 : 디렉토리 처리
		File dir = new File("D:\\temp\\2024"+File.separator+month);
		
		//디렉토리 존재 유무 확인
		if(dir.isDirectory()== false) {
			boolean isMakeDir = dir.mkdirs();
			System.out.println("ismakeDir : "+isMakeDir);
		}
		
		System.out.println(dir.getAbsolutePath());
		//파일 생성
		File file01 = new File(dir.getAbsolutePath()+File.separator+"pcwk01.txt");
		
		File file02 = new File(dir.getAbsolutePath()+File.separator+"pcwk02.txt");
		
		File file03 = new File(dir.getAbsolutePath()+File.separator+"pcwk03.txt");
		
		if(file01.exists() == false) {
			file01.createNewFile();
		}
		
		if(file02.exists() == false) {
			file02.createNewFile();
		}
		
		if(file03.exists() == false) {
			file03.createNewFile();
		}
		
		//디렉토리 내에 파일 목록
		File fileList = new File(dir.getAbsolutePath()+File.separator);
		
		File[] contents = fileList.listFiles();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		for(File content : contents) {
//			System.out.println(content.lastModified());
			System.out.printf("%-27s",sdf1.format(new Date(content.lastModified())));
			
			//file/directory 구분
			if(content.isDirectory() == true) {
				System.out.printf("%-10s %10d %-20s","<DIR>",content.length(),content.getName());
			}else {
				System.out.printf("%-10s %10d %-20s"," ",content.length(),content.getName());
			}
		
			
			
			System.out.printf("%n");
		}
	}

}
