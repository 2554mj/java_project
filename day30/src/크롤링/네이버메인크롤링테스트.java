package 크롤링;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링테스트 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.naver.com").get();
			//체인식코드 여러동작이 .으로 연결되어서 쓰여짐
			//HTML문서를 가져옴오자!
			//html 담는 부품 => Document
//			System.out.println("1.사이트 연결 성공@@@");
//			System.out.println("2.소스 받아오기 성공@@@");
//			System.out.println("doc");
			
			Elements list = doc.select("a.nav");
			//()안에다 태그이름 
			//html태그의 정식명칭 element
			//element들이 담긴 Arraylist와 유사한 부품 => Elements
//			System.out.println(list.size());
			for (Element tag : list) {
//				System.out.println(tag.text());
				//<a>text</a> : a태그안에 텍스트만가져옴
			}
			//첫번째 메일옆에 i라는 태그를 가지고오고 싶을때
			Element aTag0 = list.get(0);
			Elements list2 = aTag0.select("i");
//			System.out.println(list2.get(0));
			//항상 select는 Elements로 가져옴
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Document doc2 = Jsoup.connect("https://www.w3schools.com/tags/default.asp").get();
			System.out.println("1.사이트 연결 성공@@@");
			Elements list2 = doc2.select("a.w3-bar-item.w3-button");
			for (int i = 8; i < 18; i++) {
				System.out.println(list2.get(i).text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
