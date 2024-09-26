package com.pcwk.ehr.ed04;
/**
 * 파일 : ConstantExam.java
 * 작성자 : acorn
 * 작성일 : 2024/09/11
 */
public class ConstantExam {
	/**소스 정돈 :Ctrl + Shift + F
	 * Undo : Ctrl + Z
	 * Redo : Ctrl + Y
	 * 상수(constant)
	 * 
	 * 상수(constant)는 변수와 마찬가지로 값을 저장할 수 있는 공간, 
	 * 변수와 달리 한번 값을 저장하면 값을 다른 값으로 변경할 수 없음
	 * @param args
	 */
	public static void main(String[] args) {
		//상수의 이름은 모두 대문자, 새로운 단어를 만나면(_) 그리고 대문자
		final int MAX_NUM = 23;
		
		//MAX_NUM = 99; -> 상수 이므로 값 변경 불가
		System.out.println("MAX_NUM = "+MAX_NUM);
		
	}

}
