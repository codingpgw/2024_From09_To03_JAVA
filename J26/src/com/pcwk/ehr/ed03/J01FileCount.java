package com.pcwk.ehr.ed03;
import java.io.*;
public class J01FileCount {

	public static int countFiles(File dir) {
		int count = 0;
		
		File[] files = dir.listFiles();
		
		if(null != files) {
			for(File file : files) {
				if(file.isDirectory()) {
					count += countFiles(file);
				}else if(file.getName().endsWith(".java")){
					count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		File directory = new File("C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_20240909\\01_JAVA\\WORKSPACE\\J26\\src");
		
		if(directory.exists() && directory.isDirectory()) {
			int fileCount = countFiles(directory);
			System.out.println("총 파일 개수 : "+fileCount);
		}else {
			System.out.println("디렉토리가 존재하지 않거나 잘못된 경로입니다.");
		}

	}

}
