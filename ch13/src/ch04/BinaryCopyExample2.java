package ch04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//byte단위로 저장된 데이타(이미지,사운드,영상)파일의 복사
public class BinaryCopyExample2 {

	public static void main(String[] args) {
		//파일 정보 객체 생성
		File src=new File("c:\\temp\\copyimg.jpg");//
		File dest=new File("c:\\temp\\copyimg2.jpg");
		
		//byte단위의 데이타를 int타입의 c에 저장하기위해 변수 선언
		int c;
		try {
			     //byte단위 바이너리 파일 스트림 객체 생성
			    FileInputStream fi = new FileInputStream(src);
			    FileOutputStream fo=new FileOutputStream(dest);
			    //buff생성
			    byte[] buf = new byte[1024*10];//10kb 버퍼, [][][][][][][][][][]
			    
			   /* while(true) {
			    	c=fi.read(buf);
			    	fo.write(buf,0,c);
			    	if(c<buf.length) break;
			    }
			    */
			    while((c=fi.read(buf))!=-1){// read(buf)에 의해 읽은 데이타는 buf배열에 저장, 리턴값은 읽은 길이
			    	      fo.write(buf,0,c);//읽은 길이만큼 파일에 저장
			    }
			    
			    //자원해제
			    fi.close();
			    fo.close();
			    System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
			
		}catch(Exception e) {
			System.out.println("파일 복사 오류");
		}
	

	}

}
