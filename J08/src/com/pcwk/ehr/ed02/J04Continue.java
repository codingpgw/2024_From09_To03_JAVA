package com.pcwk.ehr.ed02;

public class J04Continue {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			//마지막 쉼표 제거
			String separator = ",";
			if(i == 9) {
				separator = "";
			}
			
			System.out.print(i + separator);
		}
			
		
	}

		
	
}

