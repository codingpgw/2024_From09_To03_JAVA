package com.pcwk.ehr.ed01;

import java.util.Stack;

public class J01Stack {

	public static void main(String[] args) {
		Stack<Integer> wallet = new Stack<Integer>();
		
		wallet.push(1000);
		wallet.push(10000);
		wallet.push(100000);
		
		System.out.println(wallet);
		
		
		System.out.println(wallet.pop());
		System.out.println(wallet.pop());
		System.out.println(wallet.pop());
		
		System.out.println(wallet.isEmpty());
	}

}
