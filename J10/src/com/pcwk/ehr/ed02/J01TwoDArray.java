package com.pcwk.ehr.ed02;

public class J01TwoDArray {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{40,40,40},
				{60,60,60},
				{80,80,80}
		};
		
		//모든 요소에 접근
		System.out.println("행(row) : "+score.length);
		System.out.println("열(col) : "+score[0].length);
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				//System.out.printf("score[%d][%d] = %d\n",i,j,score[i][j]);
				System.out.printf("%d, ",score[i][j]);
			}
			System.out.println();
		}
		
		//전체 합
		int sum = 0;
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				sum += score[i][j];
//			}
//			
//		}
		
		for(int[] scoreR : score) {
			for(int scoreC: scoreR) {
				sum += scoreC;
			}
		}
		System.out.println("총합 : "+sum);
		
	}

}

//행(row) : 5
//열(col) : 3
//100, 100, 100, 
//20, 20, 20, 
//40, 40, 40, 
//60, 60, 60, 
//80, 80, 80, 
//총합 : 900
