package com.pcwk.ehr.ed06;

public class J01ErrOut {

	public static void main(String[] args) {
		try {
			int age = Integer.parseInt("23Age");			
		}catch(NumberFormatException e) {
			System.out.println("out NumberFormatException : "+e.getMessage());
			System.err.println("err NumberFormatException : "+e.getMessage());
		}
	}

}
