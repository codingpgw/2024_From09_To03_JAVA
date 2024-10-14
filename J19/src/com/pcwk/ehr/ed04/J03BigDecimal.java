package com.pcwk.ehr.ed04;

import java.math.BigDecimal;

import com.pcwk.ehr.cmn.PLog;

public class J03BigDecimal implements PLog{

	public static void main(String[] args) {
		BigDecimal num1 = new BigDecimal("123.456");
		BigDecimal num2 = new BigDecimal("1.0");
		
		//사칙연산
		log.debug(num1.add(num2));
		log.debug(num1.subtract(num2));
		log.debug(num1.multiply(num2));
		log.debug(num1.divide(num2));
		
		log.debug(num1.divide(num2,2,BigDecimal.ROUND_HALF_UP));
		
		if(num1.equals(num2)) {
			log.debug("두 개의 BigDecimal은 같다.");
		}else {
			log.debug("두 개의 BigDecimal은 같지 않다.");
		}
	}

}
