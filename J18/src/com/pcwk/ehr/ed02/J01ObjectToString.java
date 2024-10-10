package com.pcwk.ehr.ed02;

import com.pcwk.ehr.cmn.PLog;

public class J01ObjectToString implements PLog{

	public static void main(String[] args) {
		Car car = new Car("제네시스");
		log.debug(car);
		log.debug(car.toString());
	}

}
