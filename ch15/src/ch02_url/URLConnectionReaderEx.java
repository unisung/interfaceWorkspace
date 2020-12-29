package ch02_url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReaderEx {
	public static void main(String[] args) throws MalformedURLException,IOException {//올바르지 않은 url오류 
		 //domain url주소 객체 생성
		URL site = new URL("https://www.naver.com");
		//소켓 생성
		URLConnection url = site.openConnection();//
		//문자열 입력 스트림 생성
		BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream(),"utf-8"));
		//한줄 단위 입력 문자열 변수
		String inLine;
		//입력처리
		while((inLine=in.readLine())!=null) {
			 System.out.println(inLine);
		}
		//자원해제
		in.close();
	}
}
