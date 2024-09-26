package com.pcwk.ehr.ed01;

public class J06NestedFor {

	public static void main(String[] args) {
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.printf("===== %d단 =====\n",dan);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", dan, j, (dan*j));
			}
			
		}

	}

}
