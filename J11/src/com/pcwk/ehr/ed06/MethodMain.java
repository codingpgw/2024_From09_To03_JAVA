package com.pcwk.ehr.ed06;
import com.pcwk.ehr.ed01.Person;
public class MethodMain {

	public static void main(String[] args) {
		
		//인스턴스 메서드
		Person person = new Person();
		
		person.name = "전씨";
		person.age = 23;
		
		person.sayHello();
		
		//클래스 메서드
		int sum = Calc.add(13, 15);
		System.out.printf("두 수의 합 : %d%n",sum);
	}

}
