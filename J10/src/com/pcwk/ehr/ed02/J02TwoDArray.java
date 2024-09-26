package com.pcwk.ehr.ed02;

public class J02TwoDArray {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{40,40,40},
				{60,60,60},
				{80,80,80}
		};
		
		int javaTotal = 0;
		int oracleTotal = 0;
		int springTotal = 0;
		
		System.out.println("\t 자바    오라클    Spring      합계     평균");
		System.out.println("----------------------------------------------------");
		for(int i=0; i<score.length; i++) {
			int subTotal = 0;
			double subAvg = 0.0;
			System.out.printf("%d\t",i+1);
			for(int j=0; j<score[i].length; j++) {
				subTotal += score[i][j];
				System.out.printf("%3d      ",score[i][j]);
			}
			subAvg = subTotal / (double)score[0].length;
			System.out.printf("%3d    %3.2f",subTotal,subAvg);
			javaTotal += score[i][0];
			oracleTotal += score[i][1];
			springTotal += score[i][2];
			System.out.println("");
			System.out.println("----------------------------------------------------");
			
		}
		System.out.printf("총점\t%3d\t %3d\t  %3d%n",javaTotal,oracleTotal,springTotal);
		
	}

}
//	자바    오라클    Spring      합계     평균
//----------------------------------------------------
//1	100      100      100      300    100.00
//----------------------------------------------------
//2	 20       20       20       60    20.00
//----------------------------------------------------
//3	 40       40       40      120    40.00
//----------------------------------------------------
//4	 60       60       60      180    60.00
//----------------------------------------------------
//5	 80       80       80      240    80.00
//----------------------------------------------------
//총점	300	 	 300	  300

