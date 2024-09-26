package com.pcwk.ehr.ed02;

public class Ed02VariableNaming {
/*Ctrl+/ : 한줄 comment
 * 1. 변수 명명규칙:
1) 영문자, 숫자, 밑줄, 달러 기호 사용 가능: 변수 이름은 영문자로 시작해야 하며, 영문자 이외에도 숫자 밑줄, 달러 기호를 사용할 수 있다.
2) 예약어 사용 불가 : 자바에서 이미 특정 용도로 예약된 단어들은 변수 이름으로 사용할 수 없다.
3) 대소문자 구분 : myNumber 와 MyNumber는 서로 다른 변수
4) 의미 있는 이름 사용 : 변수 이름은 해당 변수가 나타내는 데이터나 역할을 잘 설명해야 함
5) 카멜 표기법(Camel case) 사용 : 여러 단어로 이루어진 변수 이름은 카멜 표기법으로 사용하여 작성
 */
	public static void main(String[] args) {
		// int 09age; 숫자로 시작 불가
		int newAge99_$; // 영문자,숫자, 특수 기호(_, $)
		double 새로운_나이;// 한글 변수명 사용 가능(단 실재에서 사용 x)
		//int public; 예약어 사용 불가
		int myNumber = 1;
		int MyNumber = 99;
		
		System.out.println("myNumber : "+ myNumber);
		System.out.println("MyNumber : "+ MyNumber);
	}

}
