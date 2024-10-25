package com.pcwk.ehr.ed04;
import java.util.function.*;
public class J03Consumer {

	public static void main(String[] args) {
		Consumer<String> printMe = message -> System.out.printf("message : %s%n",message); 
		
		printMe.accept("ㅎㅇ");
		
	}

}
