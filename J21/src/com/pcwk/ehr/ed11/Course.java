package com.pcwk.ehr.ed11;

public class Course {
	
	//모든 사람이 등록 코스
	public static void registerCourse(Application<?> app) {
		System.out.println(app.kind.getClass().getSimpleName());
	}
	
	//학생들만 가능한 코스
	public static void registerCourse2(Application<? extends Student> app) {
		System.out.println(app.kind.getClass().getSimpleName());
	}
	
	//직장인만 가능한 코스
	public static void registerCourse3(Application<? super Worker> app) {
		System.out.println(app.kind.getClass().getSimpleName());
	}
}
