package com.pcwk.ehr.ed01;
import java.io.*;
public class J07ImageCopy {

	public static void main(String[] args) {
		//원본 이미지 경로
		String sourceImagePath = "star3.JPG";
		//복사 이미지 경로
		String destinationImagePath = "new_star3.JPG";
		
		long start = System.currentTimeMillis();
		try(FileInputStream fis = new FileInputStream(sourceImagePath);
			FileOutputStream fos = new FileOutputStream(destinationImagePath);
				) {
			
			
			int data = 0;
			//입력 스트림에서 데이터를 읽기
			while((data = fis.read()) != -1) {
//				System.out.print(data+",");
				fos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"밀리초");
		System.out.println("생성 성공");
	}
}
