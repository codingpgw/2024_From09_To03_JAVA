package com.pcwk.ehr.ed08;

public class Main {
	
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		
		return box;
	}
	public static void main(String[] args) {
		
		//제네릭 메서드 호출
		Box<Integer> box1 = boxing(99);
		
		int intValue = box1.getT();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("한강");
		String strValue = box2.getT();
		System.out.println(strValue);
	}

}
