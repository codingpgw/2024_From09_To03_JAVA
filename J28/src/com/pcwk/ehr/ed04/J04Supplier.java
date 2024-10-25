package com.pcwk.ehr.ed04;
import java.util.function.*;
public class J04Supplier {

	public static void main(String[] args) {
		Supplier<Double> randomValue = ()->Math.random();
		System.out.println(randomValue.get());
	}

}
