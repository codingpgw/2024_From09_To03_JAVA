package com.pcwk.ehr.ed01;

public class Ex01 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		//////////////////////////////////
		int score = 85;
		String result = (!(score > 90))? "가":"나";
		System.out.println(result);
		/////////////////////////////////
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
		
		/////////////////////////////////
		int value = 356;
		System.out.println((value/100)*100);
		
		/////////////////////////////////
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2.0;
		System.out.println(area);
		
		/////////////////////////////////
		int x2 = 10;
		int y2 = 5;
		
		System.out.println((x2>7)&& (y2<=5));
		System.out.println((x2%3 == 2) || (y2%2 != 1));
		
		/////////////////////////////////
		
		double x3 = 5.0;
		double y3 = 0.0;
		double z3 = 5%y3;
		System.out.println(0.0 / 0.0);//NaN
		System.out.println(1.0 / 0.0);//Infinity
		
		if(Double.isNaN(z3) == true) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result3 = z3 +10;
			System.out.println("결과: "+result3);
		}
		
	}

}
