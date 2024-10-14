package com.pcwk.ehr.ed03;

public class J03MathPaging2 {

	public static void main(String[] args) {
		//Math.ceil() : 페이징
		int totalItems = 105;
		
		int itemPerPage = 10;//한 페이지에 보여줄 항목 개수
		
		//총 페이지 수
		int totalPages = (int)Math.ceil(totalItems/(double)itemPerPage);
		System.out.println("총 페이지 수 : "+totalPages);
		
		//각 페이지의 데이터 범위 출력
		for(int i = 1; i <= totalPages; i++) {
			System.out.printf("%d페이지 : %d~%d \n",i, 1+(itemPerPage*(i-1)), Math.min(itemPerPage*i, totalItems));
		}
	}

}
