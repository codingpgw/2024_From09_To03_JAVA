package com.pcwk.ehr.ed03;

public class J03Ex04 {

	public static void main(String[] args) {
		int sum = 0;
		while(true) {
			int dice1 = (int)(Math.random()*6) +1;
			int dice2 = (int)(Math.random()*6) +1;
			sum = dice1 + dice2;
			if(sum == 5) {
				System.out.printf("(%d, %d)%n",dice1,dice2);
				System.out.printf("sum = %d%n",sum);
				break;
			}
			System.out.printf("(%d, %d)%n",dice1,dice2);
			System.out.printf("sum = %d%n",sum);
		}
	}

}
