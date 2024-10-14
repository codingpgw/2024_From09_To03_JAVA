package com.pcwk.ehr.ed04;

import java.math.BigInteger;

import com.pcwk.ehr.cmn.PLog;

public class J02BigInteger implements PLog {

	static String calcFactorial(int n) {
		return factorial(BigInteger.valueOf(n)).toString();
	}
	static BigInteger factorial(BigInteger n) {
		if(n.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		}else {
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=99; i++) {
			System.out.printf("%d = %s%n",i,calcFactorial(i));
			Thread.sleep(500);
		}
	}

}
