package ch02_url;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImageEx {
public static void main(String[] args) throws MalformedURLException {
	//�ٿ���� ����Ʈ �̹���
	String website = "http://www.oracle.com/us/hp07-bg121314-openworld-2x-2280475.jpg";
	//�޼��� ���
	System.out.println(""+website+"����Ʈ���� �̹����� �ٿ�ε��մϴ�.");
	//����Ʈ ���� ��ü ����
	URL url = new URL(website);
	//�ѹ��� 2048byteó�� �� ���� ����
	byte[] buffer = new byte[2048];
	//�ٿ�ε� ó��
	try(InputStream in=url.openStream();//���Ͽ��� ��Ʈ�� ����
		  OutputStream out = new FileOutputStream("c:\\temp\\test.jpg");) {
		   int length=0;
		   while((length=in.read(buffer))!=-1) {
			        System.out.println(""+length+"����Ʈ ��ŭ �о���!");
			        out.write(buffer,0,length);//buffer�� ����� ���� ��ŭ ���Ͽ� ����
		   }
		   System.out.println("�ٿ�ε� �Ϸ�!");
		   in.close();out.close();
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }

	
}
}
