package com.pcwk.ehr.ed03;

import java.util.Objects;

public class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model);
	}
}
