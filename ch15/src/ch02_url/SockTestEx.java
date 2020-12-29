package ch02_url;

import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class SockTestEx {

	public static void main(String[] args) {
		try(Socket s=new Socket("time-c.nist.gov",13) ) {//AutoCloseable
			    InputStream in = s.getInputStream();
			    //byte스트림을 문자열로 변환 Scanner객체 생성
			    Scanner scanner = new Scanner(in);
			    while(scanner.hasNextLine()) {//입력문자있는지 확인
			    	String line = scanner.nextLine();//문자열 단위로 출력
			    	System.out.println(line);
			    }
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
