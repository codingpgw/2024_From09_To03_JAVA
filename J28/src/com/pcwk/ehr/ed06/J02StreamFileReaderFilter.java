package com.pcwk.ehr.ed06;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;
public class J02StreamFileReaderFilter {

	public static void main(String[] args) {
		//파일 경로 설정
		Path path = Paths.get("fellow.txt");
		
		//파일을 읽어 특정 단어를 포함한 줄 검색
		try(Stream<String> lines = Files.lines(path)){
			lines.filter(line->line.contains("nation"))
				.forEach(System.out::println);
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}

}
