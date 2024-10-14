package com.pcwk.ehr.ed01;

import java.text.MessageFormat;

import com.pcwk.ehr.cmn.PLog;

public class J09MessageFormat implements PLog {

	public static void main(String[] args) {
		String tableName = "MEMBER";
		
		String memberId = "jamesol";
		String memberName = "이상무";
		
		//SQL 쿼리 포맷 작성
		String sqlFormat = "INSERT into {0} (member_id, member_name) VALUES (''{1}'',''{2}'');";
		String formattedQuery = MessageFormat.format(sqlFormat, tableName, memberId,memberName);
		
		log.debug(formattedQuery);
	}

}
