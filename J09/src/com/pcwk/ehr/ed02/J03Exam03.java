package com.pcwk.ehr.ed02;

//import java.util.Random;

public class J03Exam03 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		for(int i=0; i<ball.length;i++) {
			ball[i] = i+1;
		}
//		Random ran = new Random();
		
//        for (int i = ball.length - 1; i > 0; i--) {
//        	int j = ran.nextInt(i + 1);
//        	int j = (int)(Math.random()*44)+1;
//            
//            int temp = ball[i];
//            ball[i] = ball[j];
//            ball[j] = temp;
//        }
        for(int i = 0; i < ball.length; i++) {
        	int j = (int)(Math.random()*44)+1;
        	
        	int temp = ball[i];
        	ball[i] = ball[j];
        	ball[j] = temp;
        }
       
        for(int balls : ball) {
        	System.out.println(balls);
        }
        int extNum = 6;
        int[] num = new int[extNum];
        for(int i=0;i<extNum;i++) {
        	System.out.print(ball[i]+",");
        	num[i] = ball[i];
        }
        for(int i = 0; i < num.length; i++) {
        	for(int k = i+1; k < num.length; k++) {
        		if(num[i] > num[k]) {
        			int tmp = num[i];
        			num[i] = num[k];
        			num[k] = tmp;
        		}
        	}
        }
        System.out.println();
        for(int nums : num) {
        	System.out.print(nums+",");
        }
        
	}

}
