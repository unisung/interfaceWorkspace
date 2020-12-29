package ch02_url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReaderEx {
	public static void main(String[] args) throws MalformedURLException,IOException {//�ùٸ��� ���� url���� 
		 //domain url�ּ� ��ü ����
		URL site = new URL("https://www.naver.com");
		//���� ����
		URLConnection url = site.openConnection();//
		//���ڿ� �Է� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream(),"utf-8"));
		//���� ���� �Է� ���ڿ� ����
		String inLine;
		//�Է�ó��
		while((inLine=in.readLine())!=null) {
			 System.out.println(inLine);
		}
		//�ڿ�����
		in.close();
	}
}
