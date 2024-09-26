package com.pcwk.ehr.ed02;

public class J06Matrix {

	public static void main(String[] args) {
		int[][] A = { 
				{ 1, 2 }, 
				{ 3, 4 } 
				};
		int[][] B = { 
				{ 5, 6 }, 
				{ 7, 8 } 
				};
		int[][] result = new int[2][2];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				for(int k = 0; k < B.length; k++) {
					result[i][j] += A[i][k] * B[k][j];	
					System.out.printf("(%d * %d),",A[i][k],B[k][j]);
				}
				
			}
			System.out.println();
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.print("{");
			for (int j = 0; j < B[i].length; j++) {
				System.out.printf("%3d",result[i][j]);
			}
			System.out.print("}");
			System.out.println();
		}
		
	}

}
//(1 * 5),(2 * 7),(1 * 6),(2 * 8),
//(3 * 5),(4 * 7),(3 * 6),(4 * 8),
//{ 19 22}
//{ 43 50}

