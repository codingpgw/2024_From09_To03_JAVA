package com.pcwk.ehr.ed04;

import java.math.BigInteger;

import com.pcwk.ehr.cmn.PLog;

public class J01BigInteger implements PLog {

	public static void main(String[] args) {
		
		//Long 최대 최소값
		log.debug(Long.MAX_VALUE);
		log.debug("9223372036854775807".length());
		
		long longNum01 = 9223372036854775807L;
		log.debug(longNum01+1);
		System.out.println("======================================");
		
		BigInteger bigNum01 = new BigInteger("9223372036854775807");
		BigInteger bigNum02 = new BigInteger("1000000000000000000");
		
		log.debug(bigNum01.add(bigNum02));
		log.debug(bigNum01.subtract(bigNum02));
		log.debug(bigNum01.multiply(bigNum02));
		log.debug(bigNum01.divide(bigNum02));

	}

}
