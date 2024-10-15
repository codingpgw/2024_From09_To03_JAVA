package com.pcwk.ehr.ed10;

public class NumericBox<T extends Number> {
	private T number;

	public NumericBox(T number) {
		this.number = number;
	}

	public double getDoubleNumber() {
		return number.doubleValue();
	}
	
}
