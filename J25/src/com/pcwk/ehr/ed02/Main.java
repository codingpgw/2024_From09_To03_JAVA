package com.pcwk.ehr.ed02;
import com.google.gson.*;
public class Main {
	
	//Java Object를 to JSON
	public static void main(String[] args) {
		User user = new User("이상무", 23, true);
		
		//Gson 객체 생성
		Gson gson = new Gson();
		
		String jsonString = gson.toJson(user);
		//JSON Object : {"name":"이상무","age":23,"isActive":true}
		System.out.println("JSON Object : "+jsonString);
	}

}
