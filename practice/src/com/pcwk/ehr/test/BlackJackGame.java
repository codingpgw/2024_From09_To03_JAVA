package com.pcwk.ehr.test;

import java.util.Scanner;
public class BlackJackGame {
	
	public static void main(String[] args) {
		final int START = 2;
		Deck cardDeck = new Deck();
		Card[] user = new Card[8];
		Card[] com = new Card[8];
 		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------블랙잭 게임 시작----------");
			System.out.println("카드를 2장씩 배분하겠습니다.");
			for(int i=0; i<START; i++) {
				user[i] = cardDeck.DrawCard();
				com[i] = cardDeck.DrawCard();
				System.out.println(user[i]);
			}
			break;
			
		}
		
		sc.close();

	}

}
