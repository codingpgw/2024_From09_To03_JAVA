package com.pcwk.ehr.ed03;


public class J07Ex08 {

	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + ... + 몇까지 더해야 총합이 100이상
		int sum = 0;
		for(int i = 1; ;i++) {
			if(i % 2 != 0) {
				sum += i;
			}else {
				sum -= i;
			}
			
			if(sum >= 100) {
				System.out.println(i);
				break;
			}
		}
		
//		for(int i=1,j=1; ; i++,j*= -1) {
//			sum = sum+(i)*j;
//			System.out.printf("%3d * (%2d) = %4d%n",i,j,sum);
//			if(sum >= 100) {
//				break;
//			}
//		}
		
	}

}
