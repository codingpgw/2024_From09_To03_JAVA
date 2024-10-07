/**
 * Package Name : com.pcwk.ehr.ed05
 * Class Name : FileComment.java
 * Description : 파일 코멘트입니다.
 * Modification information : 
 * --------------------------------
 * 
 *
 * 최초 생성일 : 2024-10-01
 *---------------------------------
 * author : gy
 * since : 2024.09.09
 * see : 
 * copyright (C) by PCWK All right reserved
 */
package com.pcwk.ehr.ed02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * 
 */
public class FileComment {
	static final Logger LOG = LogManager.getLogger(FileComment.class);
	
	public static void main(String[] args) {
		//Log Level
		//FATAL>ERROR>WARN>INFO>DEBUG>TRACE
		
		LOG.trace("trace");
		LOG.debug("debug");
		LOG.info("info");
		LOG.warn("warn");
		LOG.error("ERROR");
		LOG.fatal("fatal");
	}
}
