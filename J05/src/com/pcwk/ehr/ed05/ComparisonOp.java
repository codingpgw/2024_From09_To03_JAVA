package com.pcwk.ehr.ed05;

public class ComparisonOp {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		System.out.printf("x = %d , y = %d %n", x, y);
		// 등호 연산
		boolean isEqual = (x == y);
		System.out.printf("등호 연산 : (x == y) -> %b %n", isEqual);

		// 부등호 연산
		boolean isNotEqual = (x != y);
		System.out.printf("부등호 연산 : (x != y) -> %b %n", isNotEqual);

		// 크다 연산
		boolean isGreaterThen = (x > y);
		System.out.printf("등호 연산 : (x > y) -> %b %n", isGreaterThen);

		// 작다 연산
		boolean isLessThen = (x < y);
		System.out.printf("등호 연산 : (x < y) -> %b %n", isLessThen);

		// 크거나 같다 연산
		boolean isGreaterOrEqual = (x >= y);
		System.out.printf("등호 연산 : (x >= y) -> %b %n", isGreaterOrEqual);
		
		// 작거나 같다 연산
		boolean isLessOrEqual = (x <= y);
		System.out.printf("등호 연산 : (x <= y) -> %b %n", isLessOrEqual);

	}

}
