package com.pcwk.ehr.ed11;

public class Main {

	public static void main(String[] args) {
		Course.registerCourse(new Application<Person>(new Person()));
		Course.registerCourse(new Application<Worker>(new Worker()));
		Course.registerCourse(new Application<Student>(new Student()));
		Course.registerCourse(new Application<HighStudent>(new HighStudent()));
		Course.registerCourse(new Application<MiddleStudent>(new MiddleStudent()));
		
//		Course.registerCourse2(new Application<Person>(new Person()));
//		Course.registerCourse2(new Application<Worker>(new Worker()));
		Course.registerCourse2(new Application<Student>(new Student()));
		Course.registerCourse2(new Application<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Application<MiddleStudent>(new MiddleStudent()));
		
		Course.registerCourse3(new Application<Person>(new Person()));
		Course.registerCourse3(new Application<Worker>(new Worker()));
//		Course.registerCourse3(new Application<Student>(new Student()));
//		Course.registerCourse3(new Application<HighStudent>(new HighStudent()));
//		Course.registerCourse3(new Application<MiddleStudent>(new MiddleStudent()));
		

	}

}
