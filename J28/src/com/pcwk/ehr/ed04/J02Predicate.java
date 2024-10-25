package com.pcwk.ehr.ed04;
import java.util.function.*;
public class J02Predicate {

	public static void main(String[] args) {
		Predicate<Integer> isEven = num -> num%2 == 0;
		System.out.println(isEven.test(11));
	}

}
