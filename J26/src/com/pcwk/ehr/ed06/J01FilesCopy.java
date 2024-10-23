package com.pcwk.ehr.ed06;
import java.io.IOException;
import java.nio.file.*;
public class J01FilesCopy {

	public static void main(String[] args) {
		Path source = Paths.get("pcwk_out.txt");
		Path target = Paths.get("copy_pcwk_out.txt");
		
		try {
			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("파일 copy완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
