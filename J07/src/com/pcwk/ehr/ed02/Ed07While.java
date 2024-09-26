package com.pcwk.ehr.ed02;

public class Ed07While {
	//방법 1
	public static void main(String[] args) {
		int limit = 1;
		int sum = 0;
		
		while(limit <= 10) {
			int i = 1;
			while(i <= limit) {
				System.out.print(i+"+");
				sum += i;
				i++;
			}
			System.out.println();
			limit++;
			
		}
		System.out.println(sum);

	}
	//방법 2
	public static void totalSum(int n) {
		n = 1;
		int sum = 0;
		int totalSum = 0;
		
		while(n<=10) {
			sum += n;
			totalSum += sum;
			n++;
		}
	}
}


