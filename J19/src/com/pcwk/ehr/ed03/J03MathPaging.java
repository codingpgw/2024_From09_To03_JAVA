package com.pcwk.ehr.ed03;

public class J03MathPaging {

	public static void main(String[] args) {
		//Math.ceil() : 페이징
		int totalItems = 105;
		
		int itemPerPage = 10;//한 페이지에 보여줄 항목 개수
		
		//총 페이지 수
		int totalPages = (int)Math.ceil(totalItems/(double)itemPerPage);
		System.out.println("총 페이지 수 : "+totalPages);
	}

}
