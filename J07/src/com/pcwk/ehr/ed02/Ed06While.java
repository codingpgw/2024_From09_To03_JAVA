package com.pcwk.ehr.ed02;

public class Ed06While {

	public static void main(String[] args) {
		int dan = 2;
	
		while (dan <= 9) {
			int i = 1;
			System.out.printf("=====%d단=====%n",dan);
			while(i <= 9) {
				System.out.printf("%d * %d = %2d%n",dan,i,dan*i);
				i++;
			}
			dan++;
		}
		
	}
}
