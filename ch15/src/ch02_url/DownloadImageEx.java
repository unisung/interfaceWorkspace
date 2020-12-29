package ch02_url;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImageEx {
public static void main(String[] args) throws MalformedURLException {
	//다운받을 사이트 이미지
	String website = "http://www.oracle.com/us/hp07-bg121314-openworld-2x-2280475.jpg";
	//메세지 출력
	System.out.println(""+website+"사이트에서 이미지를 다운로드합니다.");
	//사이트 정보 객체 생성
	URL url = new URL(website);
	//한번에 2048byte처리 할 버퍼 생성
	byte[] buffer = new byte[2048];
	//다운로드 처리
	try(InputStream in=url.openStream();//소켓에서 스트림 생성
		  OutputStream out = new FileOutputStream("c:\\temp\\test.jpg");) {
		   int length=0;
		   while((length=in.read(buffer))!=-1) {
			        System.out.println(""+length+"바이트 만큼 읽었음!");
			        out.write(buffer,0,length);//buffer에 저장된 길이 만큼 파일에 저장
		   }
		   System.out.println("다운로드 완료!");
		   in.close();out.close();
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }

	
}
}
