package com.pcwk.ehr.ed02;
import java.util.*;

public class J04Exam04 {
//	public static void display(int[] test) {
//		for(int number : test) {
//			System.out.print(number+",");
//		}
//		System.out.println();
//	}
	
	public static void main(String[] args) {
		int[] num = {7,4,5,1,3};
		
		System.out.println(Arrays.toString(num));
//		display(num);
		System.out.println("=================");
		for(int i = 0; i < num.length-1; i++) {
        	for(int k = i+1; k < num.length; k++) {
        		if(num[i] > num[k]) {
        			int tmp = num[i];
        			num[i] = num[k];
        			num[k] = tmp;
        		}
        	}
        }
//		display(num);
		System.out.println(Arrays.toString(num));

	}

}
