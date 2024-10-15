package com.pcwk.ehr.ed06;

public class Product<T, M> {
	//T : type
	//M : model
	
	//필드
	private T type;
	private M model;
	
	//메서드
	public T getType() {
		return type;
	}
	public void setType(T type) {
		this.type = type;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
