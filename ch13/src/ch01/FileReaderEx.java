package ch01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin=null;
		
	  try {
		  //파일과 java프로그램간에 문자단위 데이타 전달 통로 생성
		    fin=new FileReader("c:\\Temp\\test.txt");
		    int c;//입력된 문자값을 받기 위해 변수 선언 read()함수의 리턴값 int타입 
		
		    //2byte씩 파일로 부터 읽어서 모니터에 출력
		    while((c=fin.read())!=-1) {//4byte받은값
		    	  System.out.print((char)c);//2byte로 변환 출력
		    }
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
		fin.close();//자원해제
		}catch(Exception e) {}
	}

	}

}
