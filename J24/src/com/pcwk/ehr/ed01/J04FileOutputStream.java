package com.pcwk.ehr.ed01;
import java.io.*;
public class J04FileOutputStream {

	public static void main(String[] args) {
		try(OutputStream os = new FileOutputStream("test02.db")) {
			byte[] byteArr = {18,15,13,40,50};
			
			os.write(byteArr,1,3);
			os.flush();
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException : "+e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException : "+e.getMessage());
		}
		System.out.println("test02.db 생성완료");
	}

}
