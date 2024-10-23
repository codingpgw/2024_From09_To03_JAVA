package com.pcwk.ehr.ed03;
import java.io.*;
public class J02AllFileRead {
	public static int findWordFiles(File file) {
		int findCount = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line = "";
			while((line = br.readLine()) != null) {
//				System.out.println(line);
				
				//if찾기
				if(line.indexOf("if") > -1) {
					findCount++;
				}
			}
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		return findCount;
	}
	public static int countFiles(File dir) {
		int count = 0;
		
		File[] files = dir.listFiles();
		
		if(null != files) {
			for(File file : files) {
				if(file.isDirectory()) {
					count += findWordFiles(file);
				}else if(file.getName().endsWith(".java")){
					count += findWordFiles(file);
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		File directory = new File("C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_20240909\\01_JAVA\\WORKSPACE\\J26\\src\\com\\pcwk\\ehr\\ed03");
		
		if(directory.exists() && directory.isDirectory()) {
			int fileCount = findWordFiles(directory);
			System.out.println("총 파일 개수 : "+fileCount);
		}else {
			System.out.println("디렉토리가 존재하지 않거나 잘못된 경로입니다.");
		}

	}

}
