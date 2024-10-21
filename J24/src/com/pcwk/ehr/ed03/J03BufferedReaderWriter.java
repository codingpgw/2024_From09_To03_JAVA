package com.pcwk.ehr.ed03;
import java.io.*;
public class J03BufferedReaderWriter {
	
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		try(FileReader rf = new FileReader("bit.txt"); 
			BufferedReader br = new BufferedReader(rf);
			BufferedWriter bw = new BufferedWriter(new FileWriter("copy_bit.txt"));
				) {
	
			String line = "";
			int i = 1;
			while((line=br.readLine()) != null) {
				String data = i+"."+line+"\n";
//				System.out.println(i+"."+line);
				i++;
				bw.write(data);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"밀리초");
	}

}
