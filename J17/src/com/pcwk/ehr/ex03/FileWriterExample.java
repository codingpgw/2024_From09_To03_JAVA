package com.pcwk.ehr.ex03;
import java.io.IOException;
public class FileWriterExample {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("file.txt");
			fw.write("Java");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
