package com.pcwk.ehr.ed01;

import java.util.Vector;

public class J04Vector {
	public static void displayVector(Vector<String> vector) {
		System.out.printf("vector : %s%n",vector.toString());
		System.out.printf("size : %d%n",vector.size());
		System.out.printf("capacity : %d%n",vector.capacity());
		System.out.println("=======================================");
	}
	
	public static void main(String[] args) {
		//Vector 생성
		Vector<String> vector = new Vector<String>(5);
		
		displayVector(vector);
		
		vector.add("사과");
		vector.add("바나나");
		vector.add("샤인머스켓");
		vector.add("복숭아");
		vector.add("두리안");
		vector.add("딸기");
		displayVector(vector);
		
		//요소 사이즈와 capacity 동일하게
		vector.trimToSize();
		displayVector(vector);
		
		vector.remove("두리안");
		displayVector(vector);
		
		//모든 요소 접근
		int i = 0;
		for(String vectors : vector) {
			System.out.println(vector.get(i));
			i++;
		}
		
	}
	
}
