package com.pcwk.ehr.ed03;

import com.pcwk.ehr.ed02.Tv;

public class TvMain {

	public static void main(String[] args) {
		Tv tv01 = new Tv();
		Tv tv02 = new Tv();
		
		System.out.printf("tv01의 channel : %d입니다.%n",tv01.channel);
		System.out.printf("tv02의 channel : %d입니다.%n",tv02.channel);
		
		System.out.println("========================================");
		
		tv01.channel = 3;
		System.out.printf("tv01의 channel : %d입니다.%n",tv01.channel);
		System.out.printf("tv02의 channel : %d입니다.%n",tv02.channel);
		
	}

}
//tv01의 channel : 0입니다.
//tv02의 channel : 0입니다.
//========================================
//tv01의 channel : 3입니다.
//tv02의 channel : 0입니다.
