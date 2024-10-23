package com.pcwk.ehr.ed06;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
public class J02FileRead {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_20240909\\01_JAVA\\WORKSPACE\\J26\\src\\com\\pcwk\\ehr\\ed06\\J01FilesCopy.java");
		
		try {
			String content = Files.readString(path, StandardCharsets.UTF_8);
			System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
