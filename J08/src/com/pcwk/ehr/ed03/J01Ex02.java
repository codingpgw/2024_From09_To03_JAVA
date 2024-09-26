package com.pcwk.ehr.ed03;

public class J01Ex02 {

	public static void main(String[] args) {
		String grade = "B";
		int score = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
			
			}
		default -> 60;
		
		};
		System.out.println(score);

	}

}
