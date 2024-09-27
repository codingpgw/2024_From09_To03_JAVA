package com.pcwk.ehr.ed02;

public class J02Varargs {
	
	//일반 매개변수, 가변인자를 함께 사용
	public static void printDisp(String label, int ... numbers) {
		System.out.printf("label : %s%n",label);
		
		int total = 0;
		for(int num : numbers) {
			System.out.printf("%d ",num);
			total += num;
		}
		System.out.printf("total : %d%n",total);
	}
	
	public static void main(String[] args) {
		printDisp("Numbers", 1,2,3,4,5);
		System.out.println("========================");		
		//가변 인자에 전달값 없음
		printDisp("No Numbers");
		
	}
}
//label : Numbers
//1 2 3 4 5 total : 15
//========================
//label : No Numbers
//total : 0

