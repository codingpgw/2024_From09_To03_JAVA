package com.pcwk.ehr.ed01;

public class Ed01Switch {

	public static void main(String[] args) {
		// 1~6사이 난수 발생

		int dice = (int) (Math.random() * 6) + 1;
		System.out.println(dice);

		switch (dice) {// 조건식 값: 정수, 문자, 문자열
		case 1:
			System.out.println("1이(가) 나왔습니다.");
			break;
		case 2:
			System.out.println("2이(가) 나왔습니다.");
			break;
		case 3:
			System.out.println("3이(가) 나왔습니다.");
			break;
		case 4:
			System.out.println("4이(가) 나왔습니다.");
			break;
		case 5:
			System.out.println("5이(가) 나왔습니다.");
			break;
		default:
			System.out.println("6이(가) 나왔습니다.");
			break;

		}

	}

}
