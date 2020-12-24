package ch04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//문자열 단위의 파일 복사
public class FileStringCopyExample {

	public static void main(String[] args) {
	    File src=new File("c:\\windows\\system.ini");//원본
	    File dest=new File("c:\\temp\\system.txt");//타겟
	    
	    int c;
	    try {
	    	    //문자단위 입출력 스트림객체 생성
	    	     FileReader fr = new FileReader(src);
	    	     FileWriter fw = new FileWriter(dest);
	    	     while((c=fr.read())!=-1) {//2byte단위 데이타 읽어서 int c에 저장-문자 하나읽고
	    	    	      fw.write((char)c);//[][] 문자하나 저장
	    	     }
	    	    fr.close(); fw.close();
	    	    System.out.println(src.getPath() +"를 "+dest.getPath()+" 로 복사하였습니다.");
	    }catch(Exception e) {
	    	System.out.println("파일 복사 오류");
	    }
	}
	  

}
