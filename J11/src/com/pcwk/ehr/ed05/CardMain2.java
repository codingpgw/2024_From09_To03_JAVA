package com.pcwk.ehr.ed05;

import com.pcwk.ehr.ed05.Card;

public class CardMain2 {
	
	//인스턴스 메서드
	public void info() {
		System.out.println("인스턴스 메서드");
	}
	//정적 메서드
	public static void printCard(Card card) {
		System.out.printf("kind : %s, number : %d, width : %d, height : %d%n", 
				card.kind, 
				card.number,
				card.width, 
				card.height);
	}
	
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

		printCard(card7);

		printCard(card3);
		
		card7.width = 12;
		System.out.println("===============================================");
		
		printCard(card7);

		printCard(card3);
		
	}

}
//10
//20
//kind : Spade, number : 7, width : 10, height : 20
//kind : Heart, number : 3, width : 10, height : 20
//===============================================
//kind : Spade, number : 7, width : 12, height : 20
//kind : Heart, number : 3, width : 12, height : 20

