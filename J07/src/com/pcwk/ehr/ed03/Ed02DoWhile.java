package com.pcwk.ehr.ed03;

import java.util.Scanner;

public class Ed02DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomNum = (int)(Math.random()*100)+1;
		int inputNum = 0;
		int count = 0;
		
		do{
			System.out.print("1~100사이 정수를 입력하세요. > ");
			inputNum = sc.nextInt();
			count++;
			
			if(randomNum > inputNum){
				System.out.println("입력하신 수보다 큽니다.");
			}else if(randomNum < inputNum){
				System.out.println("입력하신 수보다 작습니다.");
			}
			
		}while(randomNum != inputNum);
		System.out.printf("%d번만에 맞추셨습니다. 정답: %d",count, randomNum);
		sc.close();
	}

}
