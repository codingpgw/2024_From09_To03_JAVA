package com.pcwk.ehr.ed02;

public class Ed04While {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num <= 20) {
			if(num%2 == 0 || num%3 == 0) {
				sum += num;
				System.out.println(num);
			}
			num++;
		}
		System.out.printf("1~20까지의 2와 3의 배수의 합 : %d %n",sum);

	}

}
