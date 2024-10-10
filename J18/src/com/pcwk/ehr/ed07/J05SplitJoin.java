package com.pcwk.ehr.ed07;

public class J05SplitJoin {

	public static void main(String[] args) {
		String phone = "010-4450-9382";
		String[] phoneHi = phone.split("-");
		for(String d : phoneHi) {
			System.out.print(d+" ");
		}
		System.out.println();
		System.out.println(String.join("-", phoneHi[0],phoneHi[1],phoneHi[2]));
		System.out.println(String.join("-", phoneHi));
	}

}
