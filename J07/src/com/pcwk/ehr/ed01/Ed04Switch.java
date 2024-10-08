package com.pcwk.ehr.ed01;

public class Ed04Switch {

	public static void main(String[] args) {
//		→ 사용 : 기존 : 대신 화살표(→)를 사용하여 case에 대한 코드를 작성
//		yield : 여러 줄의 코드나 복잡한 연산을 수행한 후 값을 반환할 때 yield를 사용
//		break 생략 : case문 끝에 break를 넣을 필요가 없음
//		switch는 값으로 평가 : switch 표현식은 값을 반환하며, 그 값을 변수에 할당할 수 있음.
		
		int day = 5;
		String dayName = switch(day) {
		case 0 -> "일요일";
		case 1 -> "월요일";
		case 2 -> "화요일";
		case 3 -> "수요일";
		case 4 -> "목요일";
		case 5 -> "금요일";
		case 6 -> "토요일";
		
		default -> "invalid";
		};
		
		System.out.printf("%d일은 %s입니다. %n",day, dayName);
	}

}
