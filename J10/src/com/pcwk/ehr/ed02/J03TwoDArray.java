package com.pcwk.ehr.ed02;

public class J03TwoDArray {

	public static void main(String[] args) {
		int[][] jaggedArray = new int[3][];
		jaggedArray[0] = new int[2];
		jaggedArray[1] = new int[3];
		jaggedArray[2] = new int[1];

		//배열에 값 할당
		jaggedArray[0][0] = 1;
		jaggedArray[0][1] = 2;
		
		jaggedArray[1][0] = 3;
		jaggedArray[1][1] = 4;
		jaggedArray[1][2] = 5;
		
		jaggedArray[2][0] = 6;
		
		
		for(int i=0; i<jaggedArray.length; i++) {
			
			for(int j=0; j<jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j]+",");
			}
			System.out.println();
		}
			
		
	}

}
//결과값
//1,2,
//3,4,5,
//6,
