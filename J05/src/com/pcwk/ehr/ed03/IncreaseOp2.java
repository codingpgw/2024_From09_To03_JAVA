package com.pcwk.ehr.ed03;

public class IncreaseOp2 {

	public static void main(String[] args) {
		int i = 13;
		int j = 0;
		
		j = i++;//할당하고 후 증가
		System.out.printf("i++ = %d, j = %d%n",i ,j);
		
		//초기화
		i = 13;
		j = 0;
		
		j = ++i;//선증가 할당
		System.out.printf("++i = %d, j = %d%n",i ,j);
	}

}
