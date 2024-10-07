package com.pcwk.ehr.ex02;

public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			//((C) a).method2();
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new B());
		action(new C());

	}

}
