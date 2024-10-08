package com.pcwk.ehr.ed02;

import java.util.Scanner;

public class J07Bingo {
	static int finish =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] bingo = new int[5][5];
		final int SIZE = bingo.length;
		boolean[][] marked = new boolean[SIZE][SIZE];
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				bingo[i][j] = i*5+(j+1);
			}
		}			
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				int n1 = (int)(Math.random()*SIZE);
				int n2 = (int)(Math.random()*SIZE);
				int tmp = bingo[0][0];
				bingo[0][0] = bingo[n2][n1];
				bingo[n2][n1] = tmp;
			}
		}			
	
		while(true) {
			System.out.print("1~25숫자를 입력하세요. > ");
			int answer = sc.nextInt();
			if(answer == 0) {
				System.out.println("빙고 종료");
				break;
			}
			
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<bingo[i].length; j++) {
					if(answer == bingo[i][j]) {
						bingo[i][j] = 0;
						marked[i][j] = true;
					}
					
					System.out.printf("%4d",bingo[i][j]);
					
				}
				System.out.println();	
			}
			
			if(rowBingo(marked)) {
				break;
			}
		
		}

		sc.close();
	}
	public static boolean rowBingo(boolean[][] marked) {
		int cnt = 0;
		final int SIZE = 5;
		finish = 0;
	
		for(int k=0; k<SIZE; k++) {
			cnt = 0;
			for(int x=0; x<SIZE; x++) {
				if(marked[x][k]) {
					cnt++;
				}
				
			}
			if(cnt >= SIZE) {
				finish++;
			}
		}
		for(int k=0; k<SIZE; k++) {
			cnt = 0;
			for(int x=0; x<SIZE; x++) {
				if(marked[k][x]) {
					cnt++;
				} 
			}
			if(cnt >= SIZE) {
				finish++;
			}
		
		}
	
		cnt = 0;
		for(int k=0; k<SIZE; k++) {
			if(marked[k][k]) {
				cnt++;
			}
		}
		if(cnt >= SIZE) {
			finish++;
		}
		
		cnt = 0;
		for(int k=0; k<SIZE; k++) {
			if(marked[k][SIZE-1-k]) {
				cnt++;
			}
		}
		if(cnt >= SIZE) {
			finish++;
		}
		System.out.printf("%d개의 빙고를 달성했습니다\n",finish);
		if(finish >= 3) {
			return true;
			
		}else {
			return false;
		}
		
	}

}
