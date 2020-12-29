package ch02_url;

import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class SockTestEx {

	public static void main(String[] args) {
		try(Socket s=new Socket("time-c.nist.gov",13) ) {//AutoCloseable
			    InputStream in = s.getInputStream();
			    //byte��Ʈ���� ���ڿ��� ��ȯ Scanner��ü ����
			    Scanner scanner = new Scanner(in);
			    while(scanner.hasNextLine()) {//�Է¹����ִ��� Ȯ��
			    	String line = scanner.nextLine();//���ڿ� ������ ���
			    	System.out.println(line);
			    }
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
