package com.pcwk.ehr.ed02;

public class J04Ex01 {

	public static void main(String[] args) {
		int[][] matrix = {
				{10,90,30},
				{40,20,60},
				{55,66,91}
			};
		int max = matrix[0][0];
		int min = matrix[0][0];
		for(int i = 0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[i].length; j++) {
				if(max < matrix[i][j]) {
					max = matrix[i][j];
					
				}
				if(min > matrix[i][j]) {
					min = matrix[i][j];
				}
			}
		}
		System.out.printf("max : %d,  min : %d %n",max,min);

	}
}
//max : 91,  min : 10 
