package com.pcwk.ehr.test;
import com.pcwk.ehr.test.Card;
public class Deck {
	public Card[][] deck;

    // 생성자 - 2차원 배열로 덱 초기화
    public Deck() {
        String[] cardKind = {"Spades", "Hearts", "Diamonds", "Clovers"};
        String[] cardNum = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        deck = new Card[4][13];

        // 카드 생성
        for (int i = 0; i < cardKind.length; i++) {
            for (int j = 0; j < cardNum.length; j++) {
                deck[i][j] = new Card(cardKind[i], cardNum[j]);
            }
        }
    }
    
    public void printDeck() {
		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < deck[i].length; j++) {
				System.out.println(deck[i][j]);
			}
		}
	}

    
}
