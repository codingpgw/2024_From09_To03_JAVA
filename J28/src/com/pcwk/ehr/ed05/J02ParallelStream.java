package com.pcwk.ehr.ed05;
import java.util.*;

public class J02ParallelStream {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		numbers.parallelStream()
				.map(n->n*2)
				.forEach(n -> System.out.println(n+":"+Thread.currentThread().getName())); //병렬로 처리 출력 순서는 보장되지 않음.

	}

}
