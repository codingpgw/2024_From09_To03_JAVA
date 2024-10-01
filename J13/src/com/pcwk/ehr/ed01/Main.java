package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "허스키";//부모 클래스의 Animal의 필드\
		dog.breed = "진돗개";//자식 클래스의 Dog의 필드
		
		dog.eat();//부모 클래스의 Animal의 메서드 eat
		dog.bark();//자식 클래스의 Dog의 메서드 bark
	}

}
//허스키가 밥을 먹습니다.
//진돗개가 짖습니다.
