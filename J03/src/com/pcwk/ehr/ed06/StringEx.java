/**
 * 파일명 : StringEx.java<br/>
 * 작성자 : acorn4<br/>
 * 작성일 : 2024-09-11<br/>
 */
package com.pcwk.ehr.ed06;

/**
 * 
 */
public class StringEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fruit = "포도";
		String alphaA = "A";

		System.out.println("fruit : " + fruit);
		System.out.println("alphaA : " + alphaA);
		
		//jdk 13 이전
		String statementJdk8 = "jdk 1.8 2014년 3월 18일 발표. 일반 지원은 2019년 1월에 종료되었고,"
				+ "연장 지원은 2023년 9월에 종료될 예정이다. Lambda Expression,"
				+ "Rhino 대신 Nashorn JavaScript 엔진 탑재,";
		
		System.out.println(statementJdk8);
		
		// jdk 13 이후 버전만 가능
		String statement = """
				jdk 1.8 2014년 3월 18일 발표. 일반 지원은 2019년 1월에 종료되었고,
				연장 지원은 2023년 9월에 종료될 예정이다. Lambda Expression,
				Rhino 대신 Nashorn JavaScript 엔진 탑재,
				Annotation on Java Types, Unsigned Integer 계산,
				Repeating Annotation,
				새로운 날짜와 시간 API(사실상 JodaTime이라고 보면 된다),
				Static Link JNI Library, Interface Default Method,
				PermGen 영역 삭제, Stream API 등이 추가되었다.
				본래 일반 지원은 2017년 9월 종료 예정이었으나 
				Java 9 발표의 지연 때문에 2018년 9월로 연장되었다가, 
				이후 라이선스 이관 문제로 인해 2019년 1월로 다시 연장되었다.
				32비트를 지원하는 마지막 공식 Java 버전으로, 이후 버전의 32비트 지원은 오직 서드파티를 통해서만 지원된다
								""";
		System.out.println("statement : \n"+statement);
		
		
	}

}
