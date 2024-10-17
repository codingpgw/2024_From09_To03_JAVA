package com.pcwk.ehr.ed03;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class J02HashMapIdPassword {

	public static void main(String[] args) {
		
		//ID/비번을 HashMap에 저장 이를 이용해 ID로 비번 비교
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("james","4321");
		map.put("abc","4321a");
		map.put("uId","4321u");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ID를 입력하세요. > ");
			String id = sc.nextLine().trim();
			
			System.out.print("비번을 입력하세요. > ");
			String pass = sc.nextLine().trim();
			
			System.out.printf("id : %s, 비번 : %s %n",id,pass);
			
			//id 존재 유무
			if(map.containsKey(id) == false) {
				System.out.println("id가 존재하지 않습니다. 다시 입력해 주세요.");
				continue;
			}
			
			if(map.get(id).equals(pass) == false) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}else {
				System.out.println("id와 비번 일치");
				break;
			}
		}
		System.out.println("로그인 되었습니다.");
	}

}
