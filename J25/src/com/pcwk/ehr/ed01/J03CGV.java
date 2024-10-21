package com.pcwk.ehr.ed01;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pcwk.ehr.cmn.PLog;

public class J03CGV implements PLog{
	static final String CGV = "http://www.cgv.co.kr/movies/?lt=1&ft=0";
	static final int VIEW_MOVIES = 7;
	/**
	 * URL에 있는 이미지를 local에 기록
	 * @param webUrl
	 * @param fileName
	 * @throws MalformedURLException
	 */
	
	public static void downloadImage(String webUrl, String fileName) throws MalformedURLException {
		URL url = new URL(webUrl);
		
		long start = System.currentTimeMillis();
		String path = "C:\\Users\\gy\\OneDrive\\바탕 화면\\JAP_2024311\\01_JAVA\\WORKSPACE\\J25\\img";
		try (InputStream in = url.openStream();
			 OutputStream out = new FileOutputStream(path+fileName);
				){
		byte[] bufferImg = new byte[1024];
		int len = 0;
		while((len = in.read(bufferImg)) != -1) {
			out.write(bufferImg, 0, len);
		}
			
		}catch(IOException e) {
			log.debug("IOException : {}",e.getMessage());
		}
		long end = System.currentTimeMillis();
		log.debug("파일:{} 생성, 경과시간:{}",fileName,(end-start));
	}
	
	public static void main(String[] args) {
		//downloadImage("https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88539/88539_320.jpg","아마존");
		
		
		try {
			Document doc = Jsoup.connect(CGV).get();
//			log.debug(doc.toString());
			
			//div : html
			//css : class="box-contents"
			
			//div.box-contents : '.' class에 속성
			//div.box-contents strong.title : ' '다른 html
			//제목
			Elements titles = doc.select("div.box-contents strong.title");
			//예매율
			Elements  reRates = doc.select("div.score strong.percent span");
			//포스터
			Elements  posters = doc.select("div.box-image span.thumb-image img");
			for(int i=0; i<VIEW_MOVIES; i++) {
				Element titleElement = titles.get(i);
				Element rate = reRates.get(i);
				String posterURL = posters.get(i).attr("src");
				
				
				String title = titleElement.text();
				title = title.replace(":", "");
				log.debug("{}.{}, 예매율 : {}, 포스터 URL : {}",(i+1),titleElement.text(),rate.text(),posterURL);
				downloadImage(posterURL, title+".jpg");
			}
		}catch(MalformedURLException e) {
			System.out.println("MalformedURLException : "+e.getMessage());
		}catch(IOException e) {
			System.out.println("IOException : "+e.getMessage());
		}
	}
}
