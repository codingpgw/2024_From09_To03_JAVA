package com.pcwk.ehr.ed08;

public sealed interface Vehicle permits Car,Bike {
	
	void drive();
}
