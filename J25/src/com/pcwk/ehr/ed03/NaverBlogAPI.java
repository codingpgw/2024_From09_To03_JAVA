package com.pcwk.ehr.ed03;

import java.io.*;
import java.net.*;

public class NaverBlogAPI {
//	https://openapi.naver.com/v1/search/blog.json	
	public static void main(String[] args) throws MalformedURLException {
		String clientId = "skt1hok3tjNoZGJmckTQ";
		String clientSecret = "UjrAROStEJ";
		
		//검색어. UTF-8로 인코딩되어야 합니다.
		String searchWord = null;
		
		try {
			searchWord = URLEncoder.encode("홍대 베이글","UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("searchWord : %s%n",searchWord);
		
		//JSON으로 return
		String apiURL = "https://openapi.naver.com/v1/search/blog.json?query="+searchWord;
		System.out.println(apiURL);
		
		//---------------------------------------------------------
		try {
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");//요청방식
			con.setRequestProperty("X-Naver-Client-Id",clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			
			int responseCode = con.getResponseCode();
			
			System.out.printf("responseCode : %d%n",responseCode);
			
			if(200 == responseCode) {
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				
				String line = "";
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
				
				br.close();
			}else {
				System.out.printf("인증 실패 : %d%n",responseCode);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
