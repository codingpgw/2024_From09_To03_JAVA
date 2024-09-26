package com.pcwk.ehr.ed05;

public class ComparisonOp7 {
	
	public static void main(String[] args) {
		int iNumber = 10;
		int i 		= 2;
		
		//논리 &&
		System.out.printf("수행전 i = %d %n",i);
		//					false && ...(...은 수행하지 않음)
		boolean result = ((iNumber = iNumber + 10) < 10) && ((i = i+2)<10);
		//boolean result = (((i = i+2)<10) ||(iNumber = iNumber + 10) < 10);
		
		System.out.printf("result : %b %n",result);
		
		System.out.printf("수행후 i = %d %n",i);
		System.out.printf("수행후 iNumber = %d %n",iNumber);
	}
	

}
