package com.pcwk.ehr.ex02;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student student = (Student) obj;
//		if(studentNum != student.studentNum) return false;
//		return true;
		return studentNum == student.studentNum;
	}
	
	
	
}
