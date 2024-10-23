package com.pcwk.ehr.ed02;
import java.io.*;
public class J02File {

	public static void main(String[] args) {
		String filePathName = "C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_20240909\\01_JAVA\\WORKSPACE\\J26\\src\\com\\pcwk\\ehr\\ed02"+File.separator+"J02File.java";
		
		System.out.printf("filePathName => %s%n",filePathName);
		
		//파일 객체 생성
		File f = new File(filePathName);
		
		String fileName = f.getName();
		
		System.out.printf("파일 경로 제외 파일이름 : %s%n",fileName);
		
		//파일에 확장자
		int position = fileName.lastIndexOf(".");
		System.out.printf("파일에 확장자 : %s%n",fileName.substring(position+1));
		System.out.printf("확장자 제외 파일이름 : %s%n",fileName.substring(0,position));
		
		System.out.printf("파일 경로(파일 이름 제외) : %s%n",f.getParent());
		System.out.printf("파일 경로(파일 이름 포함) : %s%n",f.getPath());
		
		//시스템 프러퍼티
		System.out.printf("프로젝트 root : %s%n", System.getProperty("user.dir"));
	}

}
