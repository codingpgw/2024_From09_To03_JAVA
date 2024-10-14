package com.pcwk.ehr.ed01;

import java.text.DecimalFormat;

import com.pcwk.ehr.cmn.PLog;

public class J08DecimalFormat implements PLog {

	public static void main(String[] args) {
		double num = 12_345.6789;
		log.debug("num : {}",num);
		
		DecimalFormat df = new DecimalFormat("0,000.00");
		//소수점 2째 자리에서 반올림
		log.debug("0,000.00 : {}",df.format(num));
		
		df = new DecimalFormat("#,###.##");
		log.debug("#,###.## : {}",df.format(num));
		
		//통화
		df = new DecimalFormat("\u00A4#,###.##");
		log.debug("\u00A4#,###.## : {}",df.format(num));
		
		//통화 : $
		df = new DecimalFormat("\u00A4#,###.##");
		log.debug("$u00A4#,###.## : {}",df.format(num));
		
		df = new DecimalFormat("###.##%");
		log.debug("###.##% : {}",df.format(0.76));
	}

}
