package com.pcwk.ehr.ed02;

public enum Color {
	Red("#FF0000"),GREEN("#00FF00"),BLUE("#0000FF");
	
	private String hexCode;
	
	private Color(String hexCode) {
		this.hexCode = hexCode;
	}

	public String getHexCode() {
		return hexCode;
	}
	
	
}
