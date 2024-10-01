package com.pcwk.ehr.test;

import java.util.Random;

public class Deck {
	public Card[][] deck;
	String[] cardKind = { "Spades", "Hearts", "Diamonds", "Clovers" };
	String[] cardNum = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	// 생성자 - 2차원 배열로 덱 초기화
	public Deck() {
	
		deck = new Card[4][13];

		// 카드 생성
		for (int i = 0; i < cardKind.length; i++) {
			for (int j = 0; j < cardNum.length; j++) {
				deck[i][j] = new Card(cardKind[i], cardNum[j]);
			}
		}
		
	}
	public Card DrawCard() {
		Random rand = new Random();

		// 랜덤으로 무늬와 값을 선택
		String randomCardKind = cardKind[rand.nextInt(cardKind.length)];
		String randomCardNum = cardNum[rand.nextInt(cardNum.length)];

		// 랜덤한 카드 생성
		Card randomCard = new Card(randomCardKind, randomCardNum);
//		System.out.println("Randomly selected card: " + randomCard);
		
		return randomCard;
	}
	
	public void printDeck() {
		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < deck[i].length; j++) {
				System.out.println(deck[i][j]);
			}
		}
	}
	
	

}
