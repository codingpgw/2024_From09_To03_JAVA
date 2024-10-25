package com.pcwk.ehr.ed06;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class J01StreamFileWrite {
	public static void main(String[] args) {
		Path path = Paths.get("output.txt");
		
		List<String> list = Arrays.asList("Java","Oracle","Html","Css","JavaScript","Spring","Python");
		
		try {
			Files.write(path, list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 생성 완료");
	}
}
