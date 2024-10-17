package com.pcwk.ehr.ed03;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class J05Properties {
	public static void main(String[] args) {
		//dev.properties
		
		Properties props = new Properties();
		
		try(FileInputStream in = new FileInputStream("dev.properties")){
			props.load(in);
			System.out.println("dev.properties 로드완료");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		String name = props.getProperty("name_han");
		System.out.println(name);
		
		props.getProperty("new_be", "spring boot");
		props.getProperty("new_be2", "스프링 boot");
		
		try(FileOutputStream out = new FileOutputStream("dev02.properties")){
			props.store(out, "프로퍼티 기록_2024-10-16");
			System.out.println("dev2.propertiex 기록완료");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
