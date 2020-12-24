package ch02;

import java.io.File;
import java.io.FileInputStream;

/* byte단위의 데이타을 읽어들이는 스트림 */
public class InputStreamExample {

	public static void main(String[] args) {
		
		System.out.println("저장된 데이타 byte길이:"+new File("c:\\temp\\test.out").length());
		//byte값을 저장할 배열
		byte[] b=new byte[6];
		
		
		try {
			     //파일로 부터 byte단위의 데이타 입력통로 FileInputStream생성
			      FileInputStream fin=new FileInputStream("c:\\temp\\test.out");
			      int n=0;//index용 변수
			      int c;//byte단위 의 입력 데이타 저장변수
			      
			      while((c=fin.read())!=-1) {// read()는 읽은 byte값을 int타입으로 변환출력, 읽은 데이타가 없으면 -1리턴
			    	     b[n]=(byte)c;// int -> byte
			    	     n++;//배열의 index번호 증가
			      }
			      
			      System.out.println("c:\\temp\\test.out 에 저장된 내용 출력: ");
			      //배열 내용 출력
			      for(int i=0;i<b.length;i++)
			    	   System.out.print(b[i]+"\t");
			      //자원해제
			      fin.close();
		}catch(Exception e) {
			 System.out.println("오류발생: " +e.getMessage());
		}
	}

}
