package com.pcwk.ehr.ed04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import com.google.gson.Gson;

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
				StringBuilder sb = new StringBuilder(1000);
				
				while((line = br.readLine()) != null) {
//					System.out.println(line);
					
					sb.append(line+"\n");
				}
				
				//System.out.println(sb.toString());
				//JSON to Object
				Gson gson = new Gson();
				
				Channel channel = gson.fromJson(sb.toString(), Channel.class);
				
				List<Item> list = channel.getItems();
				
				for(Item item : list) {
					System.out.println(item);
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
