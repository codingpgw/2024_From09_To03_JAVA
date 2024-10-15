package com.pcwk.ehr.ed01;

import com.pcwk.ehr.cmn.PLog;

public class FileComment implements PLog {

	public static void main(String[] args) {
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("ERROR");
		log.fatal("fatal");

	}

}
