package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
			Deck deck = new Deck();
			
			System.out.println(deck.pick());
			System.out.println(deck.pick(51));
			deck.shuflle();
			System.out.println(deck.pick());
	}

}
