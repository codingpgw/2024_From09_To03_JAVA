package com.pcwk.ehr.ed05;

import com.pcwk.ehr.ed05.Card;

public class CardMain {

	public static void main(String[] args) {

		// 클래스 변수
		System.out.println(Card.width);
		System.out.println(Card.height);

		// Card() 생성자 : 개발자가 만들지 않으면 Compiler가 생성
		Card card7 = new Card();
		// 인스턴스 변수
		card7.kind = "Spade";
		card7.number = 7;

		Card card3 = new Card();
		card3.kind = "Heart";
		card3.number = 3;

		System.out.printf("kind : %s, number : %d, width : %d, height : %d%n", 
				card7.kind, 
				card7.number,
				card7.width, 
				card7.height);

		System.out.printf("kind : %s, number : %d, width : %d, height : %d%n", 
				card3.kind, 
				card3.number,
				card3.width, 
				card3.height);
		
		card7.width = 12;
		System.out.println("===============================================");
		
		System.out.printf("kind : %s, number : %d, width : %d, height : %d%n", 
				card7.kind, 
				card7.number,
				card7.width, 
				card7.height);

		System.out.printf("kind : %s, number : %d, width : %d, height : %d%n", 
				card3.kind, 
				card3.number,
				card3.width, 
				card3.height);

	}

}
//10
//20
//kind : Spade, number : 7, width : 10, height : 20
//kind : Heart, number : 3, width : 10, height : 20
//===============================================
//kind : Spade, number : 7, width : 12, height : 20
//kind : Heart, number : 3, width : 12, height : 20

