package com.pcwk.ehr.ed02;

public class J05Matrix {

	public static void main(String[] args) {
		int[][] A = { { 1, 2 }, { 3, 4 } };
		int[][] B = { { 5, 6 }, { 7, 8 } };
		int[][] result = new int[2][2];

		for (int i = 0; i < A.length; i++) {
			System.out.print("{");
			for (int j = 0; j < A[i].length; j++) {
				result[i][j] = A[i][j] + B[i][j];
				System.out.printf("%3d,",result[i][j]);
			}
			System.out.print("}");
			System.out.println();
		}
	}
}
//{  6,  8,}
//{ 10, 12,}