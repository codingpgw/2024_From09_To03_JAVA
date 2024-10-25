package com.pcwk.ehr.ed03;

import java.util.function.Function;

public class J01Lambda {
	
	//함수형 인터페이스 Function을 일자로 받는 메서드
	public static void applyFunction(int value, Function<Integer, Integer> function) {
		int result = function.apply(value);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		applyFunction(5,x->x*2);
		
		applyFunction(18,x->x+10);
	}

}
