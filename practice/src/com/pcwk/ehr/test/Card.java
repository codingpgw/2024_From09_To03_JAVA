package com.pcwk.ehr.test;

public class Card {
    String cardKind;
    String cardNum;

    // 생성자
    public Card(String cardKind, String cardNum) {
        this.cardKind = cardKind;
        this.cardNum = cardNum;
    }

    @Override
    public String toString() {
        return cardKind + " " + cardNum;
    }


}
