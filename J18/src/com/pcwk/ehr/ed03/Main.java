package com.pcwk.ehr.ed03;

import com.pcwk.ehr.cmn.PLog;

public class Main implements PLog{

	public static void main(String[] args) {
		Car c1 = new Car("제네시스");
		Car c2 = new Car("제네시스");
		
		log.debug("c1.equals(c2) : "+c1.equals(c2));
		log.debug(c1.hashCode());
		log.debug(c2.hashCode());
	}

}
