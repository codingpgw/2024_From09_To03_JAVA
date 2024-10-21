package com.pcwk.ehr.ed03;
import java.io.*;
public class J02BufferedReader {
	
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		try(FileReader rf = new FileReader("bit.txt"); BufferedReader br = new BufferedReader(rf);) {
	
			String line = "";
			int i = 1;
			while((line=br.readLine()) != null) {
				System.out.println(i+"."+line);
				i++;
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"밀리초");
	}

}
