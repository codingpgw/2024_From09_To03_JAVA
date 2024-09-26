/**
 * 파일명 : CharExam.java<br/>
 * 작성자 : acorn4<br/>
 * 작성일 : 2024-09-11<br/>
 */
package com.pcwk.ehr.ed06;

/**
 * 
 */
public class CharExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char letter = 'A';
		
		System.out.println("letter : "+letter);
		
		char number = '1';
		System.out.println("number :"+number);
		
		//unicode
		char unicodeGa = '\uAC00';
		System.out.println("unicodeGa : "+unicodeGa);
		
		//숫자를 문자로 변환 : 할당 하면서 'A'로 변환 된다.
		char numberAsChar = 65;
		System.out.println("numberAsChar : "+numberAsChar);
		
		//특수문자
		char specialChar = '$';
		System.out.println("특수문자 : "+specialChar);
		
		//공백문자
		char space = ' ';
		System.out.println("공백문자 : "+space);
		
		//special 문자
		char newLine = '\n';
		System.out.print("이 문장 다음 줄 바꿈이 있습니다."+newLine);
		System.out.print("새 줄입니다.");
	}

}
