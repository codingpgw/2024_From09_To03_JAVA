package com.pcwk.ehr.ed05;
import java.util.Arrays;//배열을 to List
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class J01FilterMap {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","Oracle","Html","Css","JavaScript","Spring","Python");
		
		//List를 스트림으로 변환
//		Stream<String> stream = list.stream();
//		
//		stream.forEach(name -> System.out.println(name));
		
		
		List<String>filteredNames = list.stream()
									.filter(name->name.length() >4) //필터링
									.map(String :: toUpperCase)	    //매핑 
									.collect(Collectors.toList()); //종결연산
		
		
		System.out.println(filteredNames);

	}

}
