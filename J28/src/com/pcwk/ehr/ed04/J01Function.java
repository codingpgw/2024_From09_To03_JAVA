package com.pcwk.ehr.ed04;

import java.util.function.Function;

public class J01Function {

	public static void main(String[] args) {
		 
		Function<Integer, String> intToString = num -> "Number : "+num;
		System.out.println(intToString.apply(13));

	}

}
