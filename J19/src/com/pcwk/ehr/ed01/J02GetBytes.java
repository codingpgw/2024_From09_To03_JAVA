package com.pcwk.ehr.ed01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import com.pcwk.ehr.cmn.PLog;

public class J02GetBytes implements PLog {

	public static void main(String[] args) {
		String str = "자바";
		
		byte[] bArr = str.getBytes();
		
		//UTF-8에서는 한글 한자가 3byte
		System.out.println("UTF-8 : "+Arrays.toString(bArr));
		
		//CP949(MS949)
		try {
			byte[] bArr02 = str.getBytes("CP949");
			System.out.println("CP949 : "+Arrays.toString(bArr02));
			System.out.println("UTF-8 : "+new String(bArr, "UTF-8"));
			System.out.println("CP949 : "+new String(bArr02, "CP949"));
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
	}

}
