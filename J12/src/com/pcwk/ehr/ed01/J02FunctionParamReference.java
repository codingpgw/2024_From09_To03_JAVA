package com.pcwk.ehr.ed01;


public class J02FunctionParamReference {
	
	public static void modifyReference(int[] array) {
		array[0] = 10;
	}
	
	
	public static void main(String[] args) {
		int []arr = {1,2,3};
		
		modifyReference(arr);
		
		System.out.println(arr[0]);
		//10으로 바뀜
	}

}
