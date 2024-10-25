package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		MathOperation add = (x,y)->x+y;
		
		MathOperation multipleOp = (x,y)->x*y;
		
		//람다식을 사용한 연산
		System.out.println(add.operation(18, 15));
		System.out.println(multipleOp.operation(10, 15));
		
	}

}
