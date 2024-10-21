package com.pcwk.ehr.ed01;
import java.io.*;
public class J01OutputStream {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("text.txt");
			
			byte first = 18;
			byte second = 15;
			byte third = 13;
			
			os.write(first);
			os.write(second);
			os.write(third);
			
			os.flush();
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException : "+e.getMessage());
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(null != os) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("text.txt 생성");
	}

}
