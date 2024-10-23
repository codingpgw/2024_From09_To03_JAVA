package com.pcwk.ehr.ed04;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		AlphabetThread at = new AlphabetThread();
		at.start();
		
		String input = JOptionPane.showInputDialog("이름을 입력하세요.");
		System.out.printf("입력한 내용은 : %s%n",input);
		
		
	}

}
