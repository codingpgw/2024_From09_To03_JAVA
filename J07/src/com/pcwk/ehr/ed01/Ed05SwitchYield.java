package com.pcwk.ehr.ed01;

public class Ed05SwitchYield {

	public static void main(String[] args) {
		int score = 1000;
		String grade = switch(score/10) {
		case 10,9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		
		default -> {
			if(score < 60) {
				yield "F";
			}else {
				yield "Invaild";
			}
		}
			
		};
		System.out.println("grade : "+grade);
		
	}

}
