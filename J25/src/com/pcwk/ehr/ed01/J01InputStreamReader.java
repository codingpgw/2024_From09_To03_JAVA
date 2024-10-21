package com.pcwk.ehr.ed01;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class J01InputStreamReader {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_2024311\\01_JAVA\\WORKSPACE\\J25\\src\\com\\pcwk\\ehr\\ed01\\J01InputStreamReader.java";
		try(FileInputStream fis = new FileInputStream(args[0]);
			InputStreamReader ist = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(ist);
				){
			System.out.println("사용 중인 인코딩 : "+ist.getEncoding());
			
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		}catch(IOException e) {
			System.out.println("IOException : "+e.getMessage());
		}
		
		System.out.println("수행 완료");
	}

}
