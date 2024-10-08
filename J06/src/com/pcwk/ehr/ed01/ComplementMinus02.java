package com.pcwk.ehr.ed01;

public class ComplementMinus02 {

	public static void main(String[] args) {
//		1.먼저 양수를 2진수로 표현
//		2.모든 비트를 반전시킨다. 이것은 1의 보수를 구하는 것과 같다.
//		3.마지막으로 1을 더한다.
//		양수 = ~(양수)+1
		
		int x = 42;
		
		//비트전환 연산
		int result = ~x;
		System.out.printf("초기값 : %d%n", x);
		System.out.printf("10진수를 2진수로 변환 : %s%n",Integer.toBinaryString(x));
		System.out.printf("비트전환 연산 : %d%n", result);
		
		//양수를 음수로 전환
		int faResult = ~x + 1;
		System.out.printf("양수를 음수로 전환 : %d%n", faResult);
		
		
	}

}
