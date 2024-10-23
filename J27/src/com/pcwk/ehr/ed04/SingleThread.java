package com.pcwk.ehr.ed04;
import javax.swing.*;
public class SingleThread {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("이름을 입력하세요.");
		System.out.printf("입력한 내용은 : %s%n",input);
		
		for(char ch='A'; ch<='I'; ch++) {
			System.out.println("Alphabet : "+ch);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//0.5초 간 대기
		}

	}

}
