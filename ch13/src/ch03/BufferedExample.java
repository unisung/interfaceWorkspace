package ch03;

import java.io.BufferedOutputStream;
import java.io.FileReader;

//객체내에 데이타를 저장할 buffer가 있는 스트림 Buffered스트림
public class BufferedExample {

	public static void main(String[] args) {
		 FileReader fin=null;
		 int c;
		 try {
			 //입력스트림
			    fin=new FileReader("c:\\temp\\test2.txt");
			 //출력스트림
			    BufferedOutputStream out
			    =new BufferedOutputStream(System.out,5);//BufferedOutputStream(출력방향,버퍼크기)
			    //문자열 단위로 읽은 내용을 모니터에 byte단위로 출력
			    while((c=fin.read())!=-1) {
			    	  out.write(c);//출력
			    }
			    //버퍼내용 밀어내기
			    out.flush();//버퍼에 남아있는 문자 출력
		 }catch(Exception e) {
			 System.out.println("오류발생: "+e.getMessage());
		 }finally {
			 try {
			 fin.close();
			 }catch(Exception e) {}
		 }

	}

}
