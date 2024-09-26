package com.pcwk.ehr.ed04;

import com.pcwk.ehr.ed02.Tv;

public class TvArrMain {

	public static void main(String[] args) {
		//Tv 클래스를 배열로 생성
		Tv[] tvArr = new Tv[3];
		
		//Tv객체를 생성해서 Tv객체 배열의 각 요소에 할당
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			
			//멤버 channel호출
			tvArr[i].channel = 3+i;
			
			//메서드
			tvArr[i].channelUp();
		}
		
		for(int i=0; i<tvArr.length; i++) {
			System.out.printf("tvArr[%d].channel = %d%n",i,tvArr[i].channel);
		}
	}

}
//tvArr[0].channel = 4
//tvArr[1].channel = 5
//tvArr[2].channel = 6

